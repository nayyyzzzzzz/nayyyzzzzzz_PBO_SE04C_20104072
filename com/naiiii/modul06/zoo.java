package com.naiiii.modul06;

public class zoo {
    public static void main(String[] args){
        animal lion=new animal("leon");
        animal unknown=new animal();
        Bird eagle=new Bird("eagle",5);
        cat cat=new cat("miaw",3);

        System.out.println("lion name:"+lion.age);
        System.out.println("lion name"+lion.age);
        lion.walk();
        System.out.println();

        System.out.println("unknown name:"+unknown.name);
        System.out.println("unknown name:"+ unknown.age);
        unknown.walk();
        System.out.println();

        System.out.println("Bird name:"+eagle.name);
        System.out.println("Bird name:"+eagle.age);
        eagle.fly();
        System.out.println();

        System.out.println("cat name:"+cat.name);
        System.out.println("cat name:"+cat.age);
        cat.walk();
        System.out.println();
    }
}
