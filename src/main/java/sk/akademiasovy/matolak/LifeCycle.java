package sk.akademiasovy.matolak;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.logging.Logger;

public class LifeCycle {
    private static final Logger logger = Logger.getLogger(LifeCycle.class.getSimpleName());
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_cycle.xml");
        Coach coach = context.getBean("myCoach", Coach.class);
        logger.info(coach.getDailyFortune());
        context.close();
    }
}
