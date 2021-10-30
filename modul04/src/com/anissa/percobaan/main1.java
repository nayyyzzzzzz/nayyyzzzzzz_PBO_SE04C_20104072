package com.anissa.percobaan;

public class main1 {
    public static void main(String[]args){
        Tabungan1 saya=new Tabungan1("naiiii",547045123,1000000,316661);
        System.out.println("nama\t\t:" +saya.getNama());
        System.out.println("noRekening\t:" +saya.getNoRekening());
        System.out.println("saldo\t\t:" +saya.getSaldo());
        System.out.println("pin\t\t:" +saya.getPin());
    }
}
