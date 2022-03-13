package lesson20.ClassWork.dto;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
//@XmlRootElement(name = "auto")
@XmlType(propOrder = {"model", "price", "mark", "owner"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Car {

    @XmlAttribute(name = "m")
    private String mark;

    @XmlAttribute(name = "ml")
    private String model;

    @XmlAttribute
    private BigDecimal price;

//    @XmlTransient
    @XmlElement(name = "driver")
    private /*transient*/ Owner owner;

//    @XmlElement(name = "m")
//    public String getMark() {
//        return mark;
//    }
}
