package com.ug13.sakitrumah;

import java.io.IOException;

public class Perawat {
    private String nama;

    public Perawat(String nama) {
        this.nama = nama;
    }

    public void screening(Pengunjung pengunjung, Jadwal jadwal) throws IOException, ClassNotFoundException {
        if (jadwal.getStatusScreening()) {
            if (pengunjung.getLevelPenyakit() == 0) {
                pengunjung.setStatus(false);
            } else {
                pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit() - 1);
            }
        } else {
            System.out.println("=======ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN=====");
        }
    }

    }

