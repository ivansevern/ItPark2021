package lesson24;

/*
1.Создать ресурсный CSV-файл, в котором хранятся данные о книгах и их авторах (атрибуты книги ISBN, название,
ссылка на интернет-магазин, количество страниц, прочие атрибуты).

2.Разработать класс-запускатель, задача которого перекладывать данные из файла в таблицу/таблицы*
(если на момент запуска таблица была не пуста, то предварительно ее подчищать).

3.Разработать консольное приложение, позволяющее находить книги по названию или автору (через вхождение).
*/

import lesson24.dto.Book;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;


public class DbRunner {
    private static final Properties DB_SETTINGS = new Properties();

    static {
        try {
            DB_SETTINGS.load(DbRunner.class.getResourceAsStream("/db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException, IOException {
        System.out.println(getBookByName("SQL"));
    }

    private static List<Book> getBookByName(String name) throws SQLException {
        try (final Connection connection = DriverManager.getConnection(
                DB_SETTINGS.getProperty("jdbc.url"),
                DB_SETTINGS.getProperty("db.login"),
                DB_SETTINGS.getProperty("db.password"));
             final Statement st = connection.createStatement();
             final PreparedStatement statement = connection.prepareStatement(
                     """             
                             select name , author
                             from book 
                             """)
        ) {

            connection.setAutoCommit(false);
            Savepoint beforeCreate = connection.setSavepoint("beforeCreate");


//            st.execute("insert into book (id, name, author) values (6, 'New2', 'unknown2')");

            Savepoint beforeUpdate = connection.setSavepoint("beforeUpdate");

//            st.execute("update book set name  = 'New2'  where  id = 5");

//            statement.setString(1, name); //тут не разобрался
//            statement.setInt(1, 4); //тут 1 не понял 4 количество вывода строк таблицы
            List<Book> books = new ArrayList<>();
            try (final ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Book book = new Book(
//                            resultSet.getInt("id"),  //убрал пока лишние данные из вывода
                            resultSet.getString("name"),
//                            resultSet.getString("ISBN"),
                            resultSet.getString("author")
                    );
                    books.add(book);
                    if (new Random().nextBoolean()) {
                        connection.rollback(beforeUpdate);
                    }
                }
            }
            connection.commit();
            return books;
        }
    }
}