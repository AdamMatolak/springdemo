package sk.akademiasovy.matolak;

import java.util.logging.Logger;

public class CricketCoach implements Coach {

    Logger logger = Logger.getLogger(this.getClass().getName());
    private FortuneService fortuneService;
    private String email;
    private String team;

    public CricketCoach(){
        //empty constructor
        logger.info("Creating " + this.getClass().getName());
    }

    public void setFortuneService(FortuneService service){
        logger.info("Setting fortune service");
        fortuneService = service;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        logger.info("Setting email address");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        logger.info("Setting team");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Go outside lol";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
