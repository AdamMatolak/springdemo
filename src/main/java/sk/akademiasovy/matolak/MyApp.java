package sk.akademiasovy.matolak;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyApp {
    private static final Logger logger = Logger.getLogger(MyApp.class.getName());
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        var coach = context.getBean("baseball", Coach.class);
        logger.log(Level.INFO, coach.getDailyWorkout());
        logger.info(coach.getDailyFortune());
        context.close();


    }
}
