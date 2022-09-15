package Day1;

import Day1.Playpause;
import Day1.Power;

public class Speaker implements Power, Volume, Playpause {


    @Override
    public void play() {
        System.out.println("Hai");
        
    }

    @Override
    public void pause() {
        System.out.println("Hello");

    }

    @Override
    public void volumeUp() {
        System.out.println("Good");

    }

    @Override
    public void volumeDown() {
        System.out.println("Happy");

    }

    @Override
    public void mute() {
        System.out.println("new");

    }

    @Override
    public void powerON() {
        System.out.println("Bay");
    }

    @Override
    public void powerOFF() {
        System.out.println("Bengal");

    }
}
