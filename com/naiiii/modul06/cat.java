package com.naiiii.modul06;

public class cat {
    public String color="";

    public cat(String name){
        super(name);
    }
    public cat(String name, int age){
    }

    public cat(String name,int age,String color){
        super(name,age);
        this.color=color;
    }

    public void walk(){
        System.out.println(this.color+""+this.name+"walks!");
        System.out.println();
    }
}
