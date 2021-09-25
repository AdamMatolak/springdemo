package sk.akademiasovy.matolak;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach(){

    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Slabši trening";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
