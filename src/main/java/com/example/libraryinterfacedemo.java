package com.example;

public class libraryinterfacedemo {
    public static void main(String[] args) {

        libraryuser kd = new KidUsers("Ayushi", 10, "kids");
        kd.registerAccount();
        kd.requestBook();


        System.out.println("-----------------------------------------------------");

        KidUsers kd2= new KidUsers("Ankit", 18, "fiction") {

        };
        kd2.registerAccount();
        kd2.requestBook();


        System.out.println("-----------------------------------------------------");

        libraryuser ad=new AdultUsers("Sayantani",21,"fiction");
        ad.registerAccount();
        ad.requestBook();

        System.out.println("-----------------------------------------------------");

        libraryuser ad2= new AdultUsers("Moumita",10,"kids");
        ad2.registerAccount();
        ad2.requestBook();

    }



}



