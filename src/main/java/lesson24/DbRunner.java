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
                             
                             
                             select id, name, ISBN, author 
                             from book 
                             
                             """)
        ) {
            connection.setAutoCommit(false);
            Savepoint beforeCreate = connection.setSavepoint("beforeCreate");

//            st.execute("insert into book (id, name) values (156, 'New')");

            Savepoint beforeUpdate = connection.setSavepoint("beforeUpdate");

//            st.execute("update book set name  = 'New2' where  id = 156");

//            statement.setString(0, "name");
            List<Book> books = new ArrayList<>();
            try (final ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Book book = new Book(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("ISBN"),
                            resultSet.getString("author"));
                    books.add(book);
                    if (new Random().nextBoolean()) {
                        connection.rollback(beforeUpdate);
                    }
                    System.out.println(book);
                }
            }
            connection.commit();
            System.out.println(books);
            return books;
        }
    }
}