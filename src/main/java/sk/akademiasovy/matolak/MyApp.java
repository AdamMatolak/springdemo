package sk.akademiasovy.matolak;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        //BaseballCoach baseballCoach = new BaseballCoach();
        //baseballCoach.getDailyWorkout();
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoatch=context.getBean("baseball", Coach.class);

    }
}
