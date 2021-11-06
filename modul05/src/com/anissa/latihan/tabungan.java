package com.anissa.latihan;

public class tabungan {
    private int saldo;

    public tabungan(int saldo){
       this.saldo=saldo;
    }
    public tabungan(){
        this(5000);
    }

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldo){
        this.saldo=saldo;
    }
    public void simpanUang(int jumlah){

        saldo += jumlah;
    }
    public boolean ambilUang(int jumlah){
        if(saldo>=jumlah){
            saldo-=jumlah;
            return true;
        }
        return false;
    }
}
