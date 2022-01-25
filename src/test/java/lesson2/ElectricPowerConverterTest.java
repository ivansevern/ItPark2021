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
    public static void init() { System.out.println("Начало выполнения тестов");

    }

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
        ElectricalOfPower electricalOfPower = new ElectricalOfPower();
        double actualResult380 = for380.pFor380(1.73, 10,  0.85);
        Assert.assertEquals("проверка формулы для 380 Вольт",5.59 , actualResult380, 1);

        actualResult380 = for380.pFor380(1.73, 20, 0.85);
        Assert.assertEquals(11.18, actualResult380, 1);

        double actualResult220 = for220.pFor220(10, 0.85);
        Assert.assertEquals("проверка формулы для 220 Вольт", 1.87, actualResult220, 1);
    }
}
