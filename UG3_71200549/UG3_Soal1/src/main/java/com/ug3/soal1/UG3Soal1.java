package com.ug3.soal1;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UG3Soal1 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        SimpleDateFormat SimpleDateFormat2 = new SimpleDateFormat("hh:mm:ss aa");
        String tanggal = SimpleDateFormat.format(new Date());
        String waktu = SimpleDateFormat2.format(new Date());
        System.out.println("========Absensi Karyawan========");
        System.out.println("Absen Disini");
        System.out.print("Nama Karyawan : ");
        String nama = inp.nextLine();
        System.out.println("\n\nBerhasil Absensi");
        System.out.println("Atas nama : " + nama);
        System.out.println("Pada tanggal : " + tanggal);
        System.out.println("Pada jam : " + waktu);
    }
}
