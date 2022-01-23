package lesson2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class SecondProgram implements Sumable, Subctractionable, multiplicationable, Divisionable {

    public static void main(String[] args) {

        int arg1 = 20;
        int arg2 = 10;

        Sumable.sum(arg1, arg2);
        Subctractionable.subtraction(arg1, arg2);
        multiplicationable.multiplication(arg1, arg2);
        Divisionable.division(arg1, arg2);
    }

}
