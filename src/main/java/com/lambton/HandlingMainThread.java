package com.lambton;

public class HandlingMainThread {
    public static void main(String[] args) {

        FirstThread ft= new FirstThread("A");
        FirstThread ft1= new FirstThread("B");

        System.out.println("*********START MAIN************");

        ft.start();
        ft1.start();

        //ft.run();
        //ft1.run();



        SecondThread st= new SecondThread("X");
        Thread t= new Thread(st);

        t.start();


        System.out.println("*********END MAIN************");

    }
}
