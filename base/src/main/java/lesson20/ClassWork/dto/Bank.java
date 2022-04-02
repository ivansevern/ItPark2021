package lesson20.ClassWork.dto;

import com.opencsv.bean.CsvBindByName;
import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"id", "bic", "name"})
public class Bank {

    @XmlAttribute(name = "id")
    @CsvBindByName(column = "Идентификатор Банка")
    private Long id;
    @CsvBindByName(column = "Наименование Банка")
    private String name;
    @XmlAttribute(name = "bic")
    @CsvBindByName(column = "БИК")
    private String bic;
}
