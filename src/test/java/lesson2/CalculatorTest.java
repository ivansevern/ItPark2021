package lesson2;

import lesson2.SecondProgram;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldCalculateSum() {
        SecondProgram secondProgram = new SecondProgram();
        Assert.assertEquals("проверка",30, secondProgram.sum(20, 10));

        SecondProgram secondProgram2 = new SecondProgram();
        Assert.assertEquals(10, secondProgram2.sum(-10, 20));

        SecondProgram secondProgram3 = new SecondProgram();
        Assert.assertEquals(10, secondProgram3.sum(0, 10));
    }
    //тут выходит ошибка не знаю с чем связана
    //java: constructor SecondProgram() is already defined in class lesson2.SecondProgram


//    @Test
//    public void shouldSubtraction() {
//        SecondProgram secondProgram = new SecondProgram();
//        Assert.assertEquals(20, secondProgram.subtraction);
//
//        SecondProgram secondProgram2 = new SecondProgram();
//        Assert.assertEquals(10, secondProgram2.subtraction);
//    }
}
