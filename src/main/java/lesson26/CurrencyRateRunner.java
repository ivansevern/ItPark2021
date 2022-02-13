package lesson26;

/*
1.Реализовать приложение с использованием Spring context, создаваемый через XML конфигурацию или аннотации.

2.Приложение представляет собой справочник валют с актуальной информацией о курсах, которая извлекается,
используя API ЦБ РФ в удобном формате (список доступных API - https://www.cbr-xml-daily.ru/).
java сделать программу с запросом по сокращенному наименованию валют курса в фомате xml получая ответ в рублях кэшировать данные в виде справочника Map<String, BigDecimal>,
наполнение которого происходит единожды после создания бина сервиса/компонента. Все последующие запросы пользователя должны обрабатываться без обращения за данными по сети

3.Пользователь запрашивает информацию по интересующей валюте,
указывая ее сокращенное наименование (например, USD, EUR, KZT), в ответ получая актуальный курс в рублях.

4*. Предлагается кэшировать данные в виде справочника Map<String, BigDecimal>,
наполнение которого происходит единожды после создания бина сервиса/компонента.
Все последующие запросы пользователя должны обрабатываться без обращения за данными по сети.
*/

//https://www.cbr-xml-daily.ru/daily.xml

//<a href="https://www.cbr-xml-daily.ru/">Курсы валют, API</a>
//<a href="https://www.cbr-xml-daily.ru/">API для курсов ЦБ РФ</a>
//<a href="https://www.cbr-xml-daily.ru/">Виджет курсов валют</a>
//<a href="https://www.cbr-xml-daily.ru/">Курсы ЦБ РФ в XML и JSON, API</a>

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.InputStream;

public class CurrencyRateRunner {

    public static void main(String[] args) throws Exception {
        try (InputStream inputStream = CurrencyRateRunner.class.getResourceAsStream("/cbr.xml")) {
            Document xmlDocument = getXML(inputStream);
            XPath xPath = XPathFactory.newInstance().newXPath();
            String expression = "//Valute[@ID='R01020A']";
            Node valuteNode = (Node) xPath.compile(expression).evaluate(xmlDocument, XPathConstants.NODE);
            System.out.println("ID узла: " + valuteNode.getAttributes().getNamedItem("ID").getNodeValue());
            NodeList childNodes = valuteNode.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node node = childNodes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE && "Value".equals(node.getNodeName())) {
                    Element element = (Element) node;
                    System.out.println("Курс валюты: " + element.getTextContent());
                }
            }
            System.out.println("Содержимое тега Value: " + xPath.compile("//Valute[@ID='R01020A']/Value/text()").evaluate(xmlDocument, XPathConstants.STRING));

            double avg = (Double) xPath.compile("sum(//Valute/Value) div count(//Valute/Value)").evaluate(xmlDocument, XPathConstants.NUMBER);
            System.out.println("Среднее значение валют: " + avg);
        }
    }

    private static Document getXML(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        return builder.parse(inputStream);
    }
}
//        Currency currency = new Currency();
//        currency.setValuteId("R01010");
//        currency.setNumCode("036");
//        currency.setNominal("1");
//        currency.setName("Австралийский доллар");
//        currency.setValue(new BigDecimal("53.5105"));
//
//        JAXBContext context = JAXBContext.newInstance(Currency.class);
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//
//        StringWriter stringWriter = new StringWriter();
//        marshaller.marshal(currency, stringWriter);
//        System.out.println("XML: " + stringWriter);


//        //xml example
//        String xmldata =
//                """
//                        <Valute ID="R01035">
//                        <NumCode>826</NumCode>
//                         <CharCode>GBP</CharCode>
//                         <Nominal>1</Nominal>
//                         <Name>Фунт стерлингов Соединенного королевства</Name>
//                         <Value>104.0505</Value>
//                         </Valute>
//                """;

//                CsvToBean<Account> csvToBean = new CsvToBeanBuilder<Account>(br)
//                .withMappingStrategy(new AccountMappingStrategy())
//                .withIgnoreLeadingWhiteSpace(true)
//                .withSkipLines(1)
////                    .withType(Account.class)
//                .withSeparator(';')
//                .build();
//    }
//}
/*

* */