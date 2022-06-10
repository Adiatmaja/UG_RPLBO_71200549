package com.ug14.rumahsakit;

public class Suster {
    private int idSuster;
    private String nama;

    public Suster (String nama) {
        this.nama = nama;
    }

    public void screening (Pasien p, Jadwal j) {
        if (j.getStatusDaftar()) {
            if (j.getSuster().equals(this.nama)){
                j.setStatusScreening(true);
                j.setPasien(p);
            }
        }
    }
}
