package com.naiii.modul07.percobaan;

public class house {
    public static void main(String[] args) {

        TV tv = new TV("TV");
        AC ac = new AC("AC");
        electronics lamp = new electronics("Lamp");
        electronics device = new electronics();
        System.out.println("");

        tv.activate();
        ac.activate();
        lamp.activate();
        device.activate();
        System.out.println("");

        device.deactivate();
        lamp.deactivate();
        ac.deactivate();
        tv.deactivate();

    }
}
