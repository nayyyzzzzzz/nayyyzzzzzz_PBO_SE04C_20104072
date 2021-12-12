package com.naiii.modul08.percobaan;

public class employee {
    private String name;
    private String address;
    private int number;

    public employee(String name, String address, int number){
        this.name= name;
        this.address= address;
        this.number= number;
    }
    public void checkMail(){
        System.out.println("Checking Mails for" +address);
    }
    public String toString(){
        return name + "" + address +" "+ number;
    }
    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public int getNumber() {
        return number;
    }
}

