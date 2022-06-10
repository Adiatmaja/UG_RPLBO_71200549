package com.ug14.rumahsakit;

public class Dokter {
    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan){
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa (Pasien p, Jadwal j){
        p.setLevelPenyakit(p.getLevelPenyakit() - 1);

        if (p.getLevelPenyakit() == 0){
            p.setStatus(true);
        }
    }

    public void cekStatus (Pasien p, Jadwal j) {
        if (p.getStatus()){
            System.out.println("=====Pasien Sudah Sembuh=====");
        } else {
            System.out.println("=====Pasien masih sakit=====");
        }
    }
}
