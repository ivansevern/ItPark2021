package lesson22.ClassWork.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class Account {

    private String name;
    private BigDecimal balance;
}
