package com.erbe.learnjava;

public class MyClass4 {

    public static void main(String[] args) {
        // instantiating object
        Microphone microphone = new Microphone("Mic", "Blue", 12345);
//        microphone.name = "Mic";
//        microphone.color = "Blue";
//        microphone.model = 12345;

        microphone.setName("New Mic");
        microphone.setColor("New Blue");
        microphone.setModel(34567);

        System.out.println("New Mic: " + microphone.getName());

        Microphone mic = new Microphone("Mic1", "Red", 23456);
//        mic.name = "Mic1";
//        mic.color = "Red";
//        mic.model = 23456;

//        System.out.println(microphone.name);
//        System.out.println(mic.name);

        microphone.turnOn();
        microphone.setVolume();
        microphone.turnOff();
        System.out.println(microphone.showDescription());

        Microphone newMic = new Microphone("NewMic", "Green", 45678);
        Microphone otherMic = new Microphone();

        otherMic.setName("Other Mic");
        System.out.println(otherMic.getName());

    }
}
