package com.anissa.latihan;
// Anissa Tun Saadah 20104072
public class StudentRecord {
    private String name;
    private String addres;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double avarage;
    private static int studentCount;
    public String getName(){
        return name;
    }
    public void setName(String temp){
        name=temp;
    }
    public double getAvarage(){
        double result=0;
        result=(mathGrade+englishGrade+scienceGrade)/3;
        return result;
    }
    public static int getStudentCount(){
        return studentCount;
    }
}
