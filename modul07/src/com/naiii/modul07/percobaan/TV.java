package com.naiii.modul07.percobaan;

public class TV extends electronics {
        public TV() {
        }

        public TV(String name) {
            super(name);
        }

        public void onActivate(){
            System.out.println(this.getName() + " starts displaying image!");
        }

        public void onDeactivate(){
            System.out.println(this.getName() + " stops displaying image!");
        }

    }

