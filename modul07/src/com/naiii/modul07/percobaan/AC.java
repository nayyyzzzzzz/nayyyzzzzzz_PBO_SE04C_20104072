package com.naiii.modul07.percobaan;

public class AC extends electronics {
    public AC() {
    }

    public AC(String name) {
        super(name);
    }

    public void onActivate(){
        System.out.println(this.getName() + " starts cooling the room!");
    }

    public void onDeactivate(){
        System.out.println(this.getName() + " stops cooling the room");
    }
}
