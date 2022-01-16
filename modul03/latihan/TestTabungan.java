package modul03.latihan;
// Anissa Tun Saadah 20104072

public class TestTabungan {
    public static void main(String[] args) {
        boolean status;
        Tabungan tabungan = new Tabungan(10000);
        System.out.println("saldo awal :" + tabungan.getSaldo());
        tabungan.simpanUang(8000);
        System.out.println("jumlah uang yang disimpan : 8000");
        status = tabungan.ambilUang(7000);
        System.out.println("jumlah uang yang diambil : 7000");
        {
            if (status)
                System.out.println("ok");
            else {
                System.out.println("gagal");
            }
            tabungan.simpanUang(1000);
            System.out.println("jumlah uang yang disimpan : 1000");
            status = tabungan.ambilUang(10000);
            System.out.println("jumlah uang yang diambil : 10000");
            {
                if (status)
                    System.out.println("ok");
                else
                    System.out.println("gagal");
            }
            status = tabungan.ambilUang(2500);
            System.out.println("jumlah uang yang diamvil : 2500");
            {
                if (status)
                    System.out.println("ok");
                else
                    System.out.println("gagal");
            }
            tabungan.simpanUang(2000);
            System.out.println("jumlah uang yang disimpan : 2000");
            System.out.println("saldo sekarang ="+
                    tabungan.getSaldo());
        }
    }
}
