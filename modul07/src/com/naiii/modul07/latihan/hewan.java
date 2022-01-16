package com.naiii.modul07.latihan;

public class hewan {
        public void move() {
            System.out.println("Hewan dapat Berjalan");
        }
    }
    class Anjing extends hewan {
        public void move() {
            super.move();   // menjalankan method dari super class
            System.out.println("Anjing bisa berjalan dan berlari");
        }
    }
    class Testing {
        public static void main(String args[]) {
            hewan b = new Anjing();   // mereferensi class Hewan namun mengambil object dari Anjing
            b.move();   // menjalankan method didalam class Anjing
        }
    }


