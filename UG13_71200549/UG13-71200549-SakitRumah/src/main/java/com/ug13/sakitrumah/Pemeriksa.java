package com.ug13.sakitrumah;

import java.io.*;

public class Pemeriksa {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung, Jadwal jadwal) throws IOException, ClassNotFoundException {
        if (jadwal.getStatusScreening()){
            if (pengunjung.getLevelPenyakit() == 0) {
                pengunjung.setStatus(false);
            } else {
                pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit() - 1);
            }
        } else {
            System.out.println("Silakan melakukan registrasi");
        }
    }

    public void cekStatus(Pengunjung pengunjung){
        if (pengunjung.getLevelPenyakit() == 0){
            System.out.println("pengunjung anda sudah sembuh dan sehat");
        } else {
            System.out.println("pengunjung anda masih sakit");
        }
    }
}
