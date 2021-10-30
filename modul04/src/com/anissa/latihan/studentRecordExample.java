package com.anissa.latihan;
// Anissa Tun Saadah 20104072
public class studentRecordExample {
    public static void main(String[]args){
        StudentRecord naiii=new StudentRecord();
        StudentRecord ini=new StudentRecord();
        StudentRecord nama=new StudentRecord();
        naiii.setName("naiii");
        ini.setName("ini");
        nama.setName("nama");
        System.out.println(naiii.getName());
        System.out.println("hitung="+StudentRecord.getStudentCount
                ()
        );
    }
}
