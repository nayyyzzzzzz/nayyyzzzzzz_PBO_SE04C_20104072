package com.naiii.modul07.percobaan;

public class electronics {
        private String name;
        private boolean isActivated = false;

        public electronics() {
            this.name = "A device";
            System.out.println(this.getName()+ " has been spawned");

        }

        public electronics(String name) {
            this.name = name;
            System.out.println(this.getName()+ " has been spawned");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void activate() {
            this.isActivated = true;
            System.out.println(this.getName() + " has been activated");
            this.onActivate();
        }

        public void deactivate() {
            this.isActivated = false;
            System.out.println(this.getName() + " has been deactivated");
            this.onDeactivate();
        }

        public void onActivate(){}
        public void onDeactivate(){}
    }

