package com.ug13.sakitrumah;

import java.io.IOException;
import java.util.Scanner;

public class Pendaftaran {
    private String nama;

    public Pendaftaran(String nama) {
        this.nama = nama;
    }

    public Pengunjung registrasi() throws IOException {
        Scanner nama = new Scanner(System.in);
        String namaPengunjung;
        System.out.print("Masukkan nama anda: ");
        namaPengunjung = nama.nextLine();

        Scanner usia = new Scanner(System.in);
        int usiaPengunjung;
        System.out.print("Masukkan usia anda: ");
        usiaPengunjung = usia.nextInt();

        Scanner alamat = new Scanner(System.in);
        String alamatPengunjung;
        System.out.print("Masukkan alamat anda: ");
        alamatPengunjung = alamat.nextLine();

        Scanner penyakit = new Scanner(System.in);
        String penyakitPengunjung;
        System.out.print("Masukkan penyakit anda: ");
        penyakitPengunjung = penyakit.nextLine();

        System.out.println("========Proses registrasi berhasil========");
        return new Pengunjung(namaPengunjung, usiaPengunjung, alamatPengunjung, penyakitPengunjung);
    }
    public void mengaturJadwal(Pengunjung pengunjung, Pemeriksa pemeriksa, Jadwal jadwal) {
        if (!Pengunjung.getStatus()){
            jadwal.setPengunjung(pengunjung);
            jadwal.setPemeriksa(pemeriksa);
            jadwal.setStatusScreening(true);
            System.out.println("========Proses Pengaturan Jadwal Berhasil========");
        } else {
            System.out.println("Pengunjung tidak sakit");
        }
    }
}
