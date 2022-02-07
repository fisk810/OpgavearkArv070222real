package com.company;

public class Main {

    public static void main(String[] args) {
        //opgave 3.4.1

	    Koeretoej k;

        k = new PersonVogn(200,"df44444", 200,"2.0", 400);

        System.out.println(k.toString());

        k = new Lastbil(300, "fc55555",600, 10);

        System.out.println(k.toString());

        k = new Bus(500, "ld66666", 65, 3);

        System.out.println(k.toString());

        /*
        //opgave 3.8.1
        Ejendom e = new Villa(6, 200, 1000000);
        Butik b = new Butik(100, 200, 2000000);
        Etage et = new Etage(200, 200, 3000000, 2);


        System.out.println(e.prisPerKvm(e.pris, e.beboedeAreal));

        System.out.println(b.prisPerKvm(b.pris, b.udregnAreal()));

        System.out.println(et.prisPerKvm(et.pris, et.udregnAreal()));
        */
    }
}
