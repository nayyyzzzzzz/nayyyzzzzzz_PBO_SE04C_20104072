package com.anissa.percobaan;

/**
 *
 * @author USER
 */

public class Tabungan1 {
    private String nama;
    private int noRekening,saldo,pin;

    public Tabungan1(String nama,int noRekening,int saldo,int pin){
        this.nama=nama;
        this.noRekening=noRekening;
        this.saldo=saldo;
        this.pin=pin;
    }

    public String getNama(){
        return this.nama;
    }
    public int getNoRekening(){
        return this.noRekening;
    }
    public int getSaldo(){
        return this.saldo;
    }
    public int getPin(){
        return this.pin;
    }
}
