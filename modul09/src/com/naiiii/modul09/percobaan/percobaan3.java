package com.naiiii.modul09.percobaan;

public class percobaan3 {
    public static void main(String[] args) {
        int bil = 10 ; try{
            System.out.println(bil/0);
        }catch(ArithmeticException e){
            System.out.println("Tidak boleh membagi bilangan dengan 0");
        }
    }
}

