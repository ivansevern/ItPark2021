package lesson20;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

import java.io.StringWriter;

@Data //@ тоже не все осознал как и когда использовать
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"tableNumber", "login", "fio", "city", "position", "salary"})

public class XMLWriterRunner {
    public static void main(String[] args) throws JAXBException {
        //создание объекта Marshaller, который выполняет сериализацию
        JAXBContext context = JAXBContext.newInstance(Employees.class);  //
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        //где-то я не уловил и суть и на половину понимаю
        Employees driver = new Employees();
        driver.setTableNumber("1");
        driver.setLogin("abc");
        driver.setFio("Ivanov Ivan Ivanovich");
        driver.setCity("Moscow");
        driver.setPosition("driver");
        driver.setSalary(30000);

        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(driver, stringWriter);


        String result = stringWriter.toString();
        System.out.println(driver);
    }
}
