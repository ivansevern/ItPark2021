
package lesson2;

import lesson2.SecondProgram;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private SecondProgram secondProgram;

    @BeforeClass
    public static void init() { System.out.println("Начало выполнения тестов"); }

    @AfterClass
    public static void destroy() {
        System.out.println("Завершение выполнения тестов");
    }

    @Before
    public void initBeforeTest() {
        secondProgram = new SecondProgram();
    }

    @After
    public void destroyAfterTest() {
        secondProgram = null;
    }

    @Test
    public void shouldCalculateSum() {

        Assert.assertEquals("проверка сложения",30, Sumable.sum(20, 10));

        Assert.assertEquals(10, Sumable.sum(-10, 20));

        Assert.assertEquals(10, Sumable.sum(0, 10));
    }
    //тут выходит ошибка не знаю с чем связана
    //java: constructor SecondProgram() is already defined in class lesson2.SecondProgram


    @Test
    public void shouldSubtractionSub() {

        Assert.assertEquals("проверка вычитания",10, Subctractionable.sub(20, 10));

        Assert.assertEquals(-30, Subctractionable.sub(-10, 20));

        Assert.assertEquals(10, Subctractionable.sub(10, 0));
    }

    @Test
    public void shouldMultiplicationMult() {

        Assert.assertEquals("проверка умножения",200, Multiplicationable.mult(20, 10));

        Assert.assertEquals(1, Multiplicationable.mult(1, 1));

        Assert.assertEquals(0, Multiplicationable.mult(10, 0));
    }

    @Test
    public void shouldDivisionDiv() {

        Assert.assertEquals("проверка деления",2, Divisionable.div(20, 10));

        Assert.assertEquals(5, Divisionable.div(10, 2));

    }

    @Test(expected = ArithmeticException.class)
    public void shouldCalculatorCanCalculateDivisionByZero() {
        //       SecondProgram secondProgram = new SecondProgram(15, 0);
        Divisionable.div(15, 0);
    }
}

