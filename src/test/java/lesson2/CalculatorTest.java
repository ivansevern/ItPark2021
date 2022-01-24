
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

        Assert.assertEquals("проверка",30, Sumable.sum(20, 10));

        Assert.assertEquals(10, Sumable.sum(-10, 20));

        Assert.assertEquals(10, Sumable.sum(0, 10));
    }
    //тут выходит ошибка не знаю с чем связана
    //java: constructor SecondProgram() is already defined in class lesson2.SecondProgram


    @Test
    public void shouldSubtraction() {

        Assert.assertEquals("проверка",10, Subctractionable.subtraction(20, 10));

        Assert.assertEquals(-30, Subctractionable.subtraction(-10, 20));

        Assert.assertEquals(10, Subctractionable.subtraction(10, 0));
    }
}

