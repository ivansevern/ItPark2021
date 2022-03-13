package lesson26.ClassWork;

import lesson26.ClassWork.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigurationRunner {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        final Calculator superPuperCalculator = (Calculator) appContext.getBean("superPuperCalculator");
        final Calculator superPuperCalculator = (Calculator) appContext.getBean("calculatorImpl");
        System.out.println(superPuperCalculator.summa());

    }
}
