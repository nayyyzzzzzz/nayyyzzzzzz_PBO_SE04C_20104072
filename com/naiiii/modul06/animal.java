package com.naiiii.modul06;

public class animal {
    public String name;
    public int age;

    public animal(){
    }

    public animal(String name){
        this.name=name;
    }
    public animal(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void walk(){
        System.out.println(this.name+"walks!");
        System.out.println();
    }
}
