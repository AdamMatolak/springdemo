package sk.akademiasovy.matolak;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BeanScope {
    static Logger logger = Logger.getLogger(BeanScope.class.getSimpleName());

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_other.xml");

        Coach coach1 = context.getBean("myCoach", Coach.class);

        Coach coach2 = context.getBean("myCoach", Coach.class);

        boolean result = coach1 == coach2;

        logger.log(Level.INFO,"Result: {0}", result);

        logger.log(Level.INFO, "Memory for coach1: {0}", coach1);
        logger.log(Level.INFO, "Memory for coach2: {0}", coach2);
    }

}
