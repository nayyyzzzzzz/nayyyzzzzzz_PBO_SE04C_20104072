package com.naiii.modul07.latihan;

public class sum {

// melakukan overloading sum()

// yang mengambil dua

// parameter int.

        public int sum(int x, int y)

        {return (x + y);}



// melakukan overloading sum()

// yang mengambil tiga

// parameter int.

        public int sum(int x, int y, int z)

        {return (x + y + z);}

// melakukan overloading sum()

// yang mengambil dua

// parameter double.

        public double sum(double x, double y)

        {return (x + y);}

        /* Driver code */

        public static void main(String args[])

        {

            sum s = new sum();

            System.out.println(s.sum(10, 20));

            System.out.println(s.sum(10, 20, 30));

            System.out.println(s.sum(10.5, 20.5));

        }
    }

