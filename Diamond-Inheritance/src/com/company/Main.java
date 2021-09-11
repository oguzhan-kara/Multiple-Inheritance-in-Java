package com.company;


public class Main implements Liger,Cat,Tiger,Lion{

    public static void main(String args[]) {

        Liger newborn = new Liger() {

            @Override
            public void run() {

                System.out.println("Runningg");
            }

            @Override
            public void roar() {

                System.out.println("RRRRrrrrr");
            }

            @Override
            public void breath() {
                System.out.println("Breathing");
            }
        };
        newborn.roar();
        newborn.run();
        newborn.breath();



    }

    @Override
    public void run() {
    }
    @Override
    public void roar() {
    }
    @Override
    public void breath() {
    }
}
