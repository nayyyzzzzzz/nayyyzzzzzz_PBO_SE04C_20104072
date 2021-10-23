package modul03.latihan;

public class Tabungan {

    public int saldo;

    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public void simpanUang(int jumlah){
        saldo += jumlah;
    }

    public boolean ambilUang(int jumlah){
        if (jumlah <= getSaldo()){
            saldo -= jumlah;
            return true;
        }
        else {
            return false;
        }

    }

}