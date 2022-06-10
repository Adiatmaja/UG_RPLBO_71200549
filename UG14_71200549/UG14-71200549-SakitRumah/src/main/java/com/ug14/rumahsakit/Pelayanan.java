package com.ug14.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private int idPelayanan;
    private String nama;

    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien p, Dokter d, Suster s, Jadwal j) {
        if (!p.getStatus()) {
            j.setStatusDaftar(true);
            j.setPasien(p);
            j.setDokter(d);
            j.setSuster(s);
            System.out.println("Data Jadwal Berhasil Disimpan!");
            System.out.println("==========Proses Pengaturan Jadwal Berhasil==========");
        }
    }

    public Pasien registrasi(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan nama anda: ");
        String nama = inp.nextLine();

        Scanner inp2 = new Scanner(System.in);
        System.out.print("Masukkan usia anda: ");
        int usia = Integer.parseInt(inp2.nextLine());

        Scanner inp3 = new Scanner(System.in);
        System.out.print("Masukkan alamat anda: ");
        String alamat = inp3.nextLine();

        Scanner inp4 = new Scanner(System.in);
        System.out.print("Masukkan penyakit anda: ");
        String penyakit = inp4.nextLine();

        System.out.println("Data Pasien Berhasil Disimpan");
        System.out.println("==========Proses Registrasi Berhasil==========");

        return new Pasien(nama, usia, alamat, penyakit);
    }
}
