package sk.akademiasovy.matolak;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Wish you the happiest day in your life!!";
    }
}
