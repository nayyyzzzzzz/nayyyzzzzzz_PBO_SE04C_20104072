package com.anissa.percobaan;

public class main2 {
    public static void main(String[]args){
        Tabungan2 saya=new Tabungan2("naiiii",316661);
        Tabungan2 kamu=new Tabungan2("koko",190398,150000,290821);

        saya.setSaldo(10000);
        saya.setPin(300921);

        System.out.println("saldo awal saya:" +saya.getSaldo());
        System.out.println("Saldo awal kamu:"+kamu.getSaldo());
        System.out.println("nomor pin kamu:"+kamu.getPin());
    }
}
