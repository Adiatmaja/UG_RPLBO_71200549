package com.ug11.kalkulasipersentase;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String text = inp.nextLine();

        String[] isiTeks = text.split("\\s+");
        String persen = "%";
        String saham = "";
        Integer jumlah = 0;

        float total = 0;

        for (String i : isiTeks) {

            if(i.matches(".*\\d.*")){
                saham += i;
                String angka = saham.substring(0, Math.min(saham.length(), 3));
                total += Float.parseFloat(angka);
                jumlah += 1;
                if (jumlah == 1){
                    saham += " + ";
                }
            }
        }

        System.out.println("Rincian perhitungan: " + saham);
        System.out.println("Total kenaikan (Dalam Persen): " + total + "%");
    }
}