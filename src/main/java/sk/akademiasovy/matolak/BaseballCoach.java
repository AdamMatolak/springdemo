package sk.akademiasovy.matolak;

public class BaseballCoach implements Coach {

    public String getDailyWorkout(){
        return "Spend 10 minutes on practise";
    }

    @Override
    public String getDailyFortune() {
        return "The more homeruns you will make, the happier your day will be";
    }

}
