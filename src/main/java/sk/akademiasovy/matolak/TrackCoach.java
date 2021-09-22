package sk.akademiasovy.matolak;

public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run hard about 5 km";
    }

    @Override
    public String getDailyFortune() {
        return "Running will lead you to exhaustion, but the happy day awaits.";
    }
}
