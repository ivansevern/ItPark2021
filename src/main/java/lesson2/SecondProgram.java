package lesson2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class SecondProgram implements Sumable, Subctractionable, Multiplicationable, Divisionable {

    public static void main(String[] args) {

        int arg1 = 20;
        int arg2 = 10;

        Sumable.sum(arg1, arg2);
        Subctractionable.sub(arg1, arg2);
        Multiplicationable.mult(arg1, arg2);
        Divisionable.div(arg1, arg2);
    }

}
