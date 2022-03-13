package lesson26.HomeWork;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

import java.math.BigDecimal;

@Data
@XmlRootElement(name = "currency")
@XmlAccessorType(XmlAccessType.FIELD)
public class Currency {

    @XmlAttribute(name = "Valute ID")
    private String valuteId;

    @XmlAttribute(name = "NumCode")
    private String numCode;

    @XmlAttribute(name = "CharCode")
    private String charCode;

    @XmlAttribute(name = "Nominal")
    private String nominal;

    @XmlAttribute(name = "Name")
    private String name;

    @XmlAttribute(name = "Value")
    private BigDecimal value;
}
