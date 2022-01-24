package lesson2;

import lesson2.ElectricalOfPower;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElectricPowerConverterTest {
    private ElectricalOfPower electricalOfPower;

    @BeforeClass
    public static void init() { System.out.println("Начало выполнения тестов"); }

    @AfterClass
    public static void destroy() {
        System.out.println("Завершение выполнения тестов");
    }

    @Before
    public void initBeforeTest() {
        electricalOfPower = new ElectricalOfPower();
    }

    @After
    public void destroyAfterTest() {
        electricalOfPower = null;
    }

    @Test
    public void shouldMultiplicationPower() {

        Assert.assertEquals("проверка умножения",5.59 , for380.pFor380(1.73, 10.0, 0.85));

    }
}
