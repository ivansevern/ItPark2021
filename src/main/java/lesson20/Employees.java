package lesson20;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

/*
* 1. Создать класс сотрудников Employee с атрибутами:
 табельный номер,
 логин,
 ФИО,
 подразделение и город (в рамках объекта класса департамента),
 должность и зарплата (в рамках объекта класса должность)

2. Необходимо с помощью технологии JAXB произвести процедуру маршалинга состояния объектов
 данного класса во внешний файл employee.xml.

3. С помощью XPath выражения найти всех сотрудников, у которых зарплата превышает среднее значение

 4*. Преобразовать содержимое файла employee.xml в JSON-формат, получив на выходе employee.json

5*. С помощью Jackson получить список объектов Employee и вывести информацию
 о сотрудниках с нечетными индексами в списке.

*/
// определяем корневой элемент
//@XmlRootElement
@Data
// определяем последовательность тегов в XML
@XmlType(propOrder = {"tableNumber", "login", "fio", "city", "position", "salary"})
public class Employees {
    private String tableNumber;
    private String login;
    private String fio;
    private String city;
    private String position;
    private double salary;

    public Employees() {
    }

    public Employees(String tableNumber, String login, String fio, String city, String position, double salary) {
        this.tableNumber = tableNumber;
        this.login = login;
        this.fio = fio;
        this.city = city;
        this.position = position;
        this.salary = salary;
    }

    // указываем, что id должно быть атрибутом
    @XmlAttribute
    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "tableNumber='" + tableNumber + '\'' +
                ", login='" + login + '\'' +
                ", fio='" + fio + '\'' +
                ", city='" + city + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

//    public static void main(String[] args) {
//        Employees driver = new Employees("1", "abc", "Ivanov Ivan Ivanovich", "Moscow", "driver", 30000);
//        Employees teacher = new Employees("2", "cba", "Sidorov Vladimir Petrovich", "Tula", "teacher", 35000);
//        Employees engineer = new Employees("3", "123", "Petrov Vladimir Olegovich", "Kaluga", "engineer", 45000);
//
//
//    }
}
