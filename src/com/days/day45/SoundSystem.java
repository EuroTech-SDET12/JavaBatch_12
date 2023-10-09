package com.days.day45;

public class SoundSystem {

    // common field
    double power;
    double decibelRate;
    double volumeLevel;
    String input;


    // for only earplugs
    public void activeNoiseCancelSystem(){
        // use it only with earplugs obj!!
    }

    // for only stereos
    public void highDbCheck(){

    }

    // common method
    public void powerON(){

    }


    public static void main(String[] args) {
        SoundSystem earplugs= new SoundSystem();

        SoundSystem stereos= new SoundSystem();
    }
}

class Earplugs{
    double power;
    double decibelRate;
    double volumeLevel;
    String input;


    public void activeNoiseCancelSystem(){
        // use it only with earplugs obj!!
    }
    public void powerON(){

    }
}

class Stereos{
    double power;
    double decibelRate;
    double volumeLevel;
    String input;

    public void highDbCheck(){

    }
    public void powerON(){

    }
}
