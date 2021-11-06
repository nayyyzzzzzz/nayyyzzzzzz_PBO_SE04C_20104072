package com.anissa.latihan;

public class Nasabah<Tabungan> {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;

    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal=namaAwal;
        this.namaAkhir=namaAkhir;
    }
    public void setTabungan(Tabungan tabungan){
        this.tabungan=tabungan;
    }

    public String getNamaAwal(){
        return namaAwal;
    }

    public String getNamaAkhir(){
        return namaAkhir;
    }
    public Tabungan getTabungan(){
        return tabungan;
    }
}
