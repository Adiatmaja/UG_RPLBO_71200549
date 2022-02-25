package com.ug3.soal2;

public class Lampu {
    public static void main(String[] args) {
        for(;;) {
            System.out.println("Lampu merah menyala selama : ");
            for (int i = 20; i >= 1; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(i);
                }
            }
            System.out.println("\nAkan berganti ke lampu kuning\n");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                ;
            }

            System.out.println("Lampu kuning menyala selama : ");
            for (int i = 2; i >= 1; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(i);
                }
            }
            System.out.println("\nAkan berganti ke lampu hijau\n");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                ;
            }

            System.out.println("Lampu hijau menyala selama : ");
            for (int i = 15; i >= 1; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(i);
                }
            }
            System.out.println("\nAkan berganti ke lampu kuning\n");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                ;
            }

            System.out.println("Lampu kuning menyala selama : ");
            for (int i = 2; i >= 1; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(i);
                }
            }

            System.out.println("\nAkan berganti ke lampu merah\n");
        }
    }
}
