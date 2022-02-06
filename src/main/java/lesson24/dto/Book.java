package lesson24.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    private int id;
    private String name;
    private String ISBN;
    private String author;
//    private String shop;
//    private int year;
}
