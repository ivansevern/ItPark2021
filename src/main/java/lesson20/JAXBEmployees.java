package lesson20;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class JAXBEmployees {
    public static void main(String[] args) {

        String fileName = "C:/driver.xml";

//        Employees driver = new Employees("1", "abc", "Ivanov Ivan Ivanovich", "Moscow", "driver", 30000);
//        Employees teacher = new Employees("2", "cba", "Sidorov Vladimir Petrovich", "Tula", "teacher", 35000);
//        Employees engineer = new Employees("3", "123", "Petrov Vladimir Olegovich", "Kaluga", "engineer", 45000);
        Employees driver = new Employees();
        driver.setTableNumber("1");
        driver.setLogin("abc");
        driver.setFio("Ivanov Ivan Ivanovich");
        driver.setCity("Moscow");
        driver.setPosition("driver");
        driver.setSalary(30000);

        convertObjectToXml(driver, fileName);

        Employees unmarshEmployees = fromXmlToObject(fileName);
        if (unmarshEmployees != null) {
            System.out.println(unmarshEmployees.toString());
        }
    }

    private static Employees fromXmlToObject(String filePath) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Employees.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (Employees) un.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void convertObjectToXml(Employees driver, String filePath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Employees.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            marshaller.marshal(driver, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}