package sk.akademiasovy.matolak;

import java.util.logging.Logger;

public class TrackCoach implements Coach{
    Logger logger = Logger.getLogger(this.getClass().getSimpleName());
    @Override
    public String getDailyWorkout() {
        return "Run hard about 5 km";
    }

    @Override
    public String getDailyFortune() {
        return "Running will lead you to exhaustion, but the happy day awaits.";
    }
    public void initMethod(){
        logger.info("Initial method");
    }

    public void cleanUpMethod(){
        logger.info("Cleaning up method");
    }

}
