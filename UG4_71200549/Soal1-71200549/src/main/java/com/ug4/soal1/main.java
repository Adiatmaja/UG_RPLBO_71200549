package com.ug4.soal1;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class main {
    private static final Scanner Scanner;

    public main() {
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("Pohon kehidupan\nMari menyiapkan pohon kehidupanmu");
        System.out.println("==================================================");
        System.out.print("Berapa banyak daun yang akan dimiliki: ");
        int daun = Scanner.nextInt();
        Scanner.nextLine();
        System.out.print("Berapa banyak akar yang akan tumbuh: ");
        int akar = Scanner.nextInt();
        Scanner.nextLine();
        System.out.print("Berapa banyak dahan yang akan dimiliki: ");
        int dahan = Scanner.nextInt();
        Scanner.nextLine();
        System.out.println("Masa hidup pohon kamu adalah " + Pohon.getMasahidup() + " tahun");
        System.out.print("Berapa umur mulai pohon kamu (tahun): ");
        int umur = Scanner.nextInt();
        Scanner.nextLine();
        if (umur > Pohon.getMasahidup()) {
            System.out.println("Maaf umur melebihi masa hidup pohon kamu");
            System.out.println("\n\n");
        } else {
            Pohon pohon = new Pohon(daun, akar, dahan, umur);
            System.out.println("Pohon kehidupan kamu sudah tumbuh");
            System.out.println("=====================================================================================");
            System.out.println("\n\n");
            System.out.flush();
            menu(pohon);
        }
    }

    private static void menu(Pohon pohon) {
        System.out.println("=========================================================================================");
        System.out.println("Pohon kehidupan\nAtur pohon kamu agar menjadi pohon yang bermanfaat");
        System.out.println("=========================================================================================");
        System.out.println();
        System.out.println("1. Tampilkan informasi pohon\n2. Masukan musim sekarang\n3. Panen buah\n4. Keluar");
        System.out.print("Pilihan kamu: ");
        int pilihan = Scanner.nextInt();
        Scanner.nextLine();
        if(pilihan == 1) {
            info(pohon);
        } else if (pilihan == 2) {
            musim(pohon);
        } else if (pilihan == 3) {
            panen(pohon);
        } else if (pilihan == 4) {
            System.out.println("Makasih sudah membuat pohon kehidupan\nSampai jumpa dilain waktu");
            return;
        } else {
            System.out.println("Input kamu salah");
            System.out.println("\n");
            System.out.flush();
            menu(pohon);
        }
    }

    private static void info(Pohon pohon) {
        System.out.println("\nIntip Pohonmu Yuk\n1. Tampilkan jumlah daun\n2. Tampilkan jumlah akar\n3. Tampilkan jumlah dahan\n4. Tampilkan umur pohon kamu sekarang\n5. Tampilkan rentang hidup pohon kamu\n6. Tampilkan musim apa sekarang\n7. Tampilkan berapa banyak buah yang sudah dipanen\n8. Kembali");
        System.out.print("Pilihan kamu: ");
        int pilihan = Scanner.nextInt();
        Scanner.nextLine();
        PrintStream var10000;
        if(pilihan == 1) {
            System.out.println("Jumlah daun pohon kamu sebanyak " + pohon.getDaun() + " helai");
            info(pohon);
        } else if(pilihan == 2) {
            System.out.println("Jumlah akar pohon kamu sebanyak " + pohon.getAkar() + " akar");
            info(pohon);
        } else if(pilihan == 3) {
            System.out.println("Jumlah dahan pohon kamu sebanyak " + pohon.getDahan() + " buah dahan");
            info(pohon);
        } else if(pilihan == 4) {
            System.out.println("Umur pohon kamu sekarang " + pohon.getUmur() + " tahun");
            info(pohon);
        } else if(pilihan == 5) {
            System.out.println("Rentang masa hidup pohon kamu selama " + Pohon.getMasahidup() + " tahun");
            info(pohon);
        } else if(pilihan == 6) {
            if (pohon.getMusim() == null) {
                System.out.println("Maaf kamu belum mengatur musim apa yang akan berlangsung untuk pohon kehidupanmu\nAtur musim dulu gih");
            } else {
                var10000 = System.out;
                String var2 = pohon.getMusim().getName();
                var10000.println("Sekarang adalah Musim " + var2 + " dan pohon kamu sedang musim buah " + pohon.getBuah().getName());
            }
            System.out.println("\n");
            info(pohon);
        } else if(pilihan == 7) {
            var10000 = System.out;
            int var10001 = pohon.getBuah().getJumlah();
            var10000.println("Kamu sudah memanen sebanyak " + var10001 + " buah " + pohon.getBuah().getName() + " saat ini");
            info(pohon);
        } else if(pilihan == 8) {
            menu(pohon);
        }else {
            System.out.println("Input yang kamu masukin salah");
            System.out.flush();
            info(pohon);
        }
    }

    private static void musim(Pohon pohon) {
        int hari = 0;
        System.out.println("\n\n");
        System.out.print("Masukan musim apa sekarang (Kemarau, Penghujan, Dingin): ");
        String namaMusim = Scanner.nextLine();
        if (namaMusim.isEmpty()) {
            System.out.println("Kamu belum masukin musim apa sekarang");
            System.out.println("\n\n");
            musim(pohon);
        } else if (!namaMusim.equalsIgnoreCase("kemarau") && !namaMusim.equalsIgnoreCase("penghujan") && !namaMusim.equalsIgnoreCase("dingin")) {
            System.out.println("Musim yang kamu masukan ga sesuai");
            System.out.println("\n\n");
            musim(pohon);
        } else {
            if (namaMusim.equalsIgnoreCase("kemarau")) {
                hari = 40;
            } else if (namaMusim.equalsIgnoreCase("penghujan")) {
                hari = 30;
            } else if (namaMusim.equalsIgnoreCase("dingin")) {
                hari = 60;
            }

            Musim musim = new Musim(namaMusim, hari);
            pohon.setMusim(musim);
            System.out.println("Berhasil menambahkan musim untuk pohonmu");
            menu(pohon);
        }
    }

    private static void panen(Pohon pohon) {
        if (pohon.getMusim() != null) {
            LocalDate hariIni = LocalDate.now();
            LocalDate hariPanen = pohon.getTanggalMusim();
            hariPanen = hariPanen.plusDays((long)pohon.getBuah().getMasaPanen());
            long selisihHari = ChronoUnit.DAYS.between(hariIni, hariPanen);
            String today = hariIni.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            String harvestDay = hariPanen.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            String tanggalMusim = pohon.getTanggalMusim().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
            System.out.println("\n\n");
            System.out.println("=====================================================================================");
            System.out.println("Ayo panen buahnya");
            System.out.println("Tanggal musim : " + tanggalMusim);
            System.out.println("Tanggal hari ini : " + today);
            System.out.println("Tanggal panen: " + harvestDay);
            System.out.println("Hari sebelum masa panen: " + selisihHari + " hari");
            System.out.println();
            PrintStream var10000;
            String var10001;
            if (selisihHari <= 1L && selisihHari > -1L) {
                var10000 = System.out;
                var10001 = pohon.getBuah().getName();
                var10000.println("Pohon kamu akan berbuah " + var10001 + "setiap  hari dan kamu dapat memetik buah tersebut dalam " + pohon.getBuah().getLamaBertahan() + " hari sebelum buah " + pohon.getBuah().getName() + " busuk");
            } else if (selisihHari > 1L) {
                var10000 = System.out;
                var10001 = pohon.getBuah().getName();
                var10000.println("Pohon kamu akan berbuah " + var10001 + " setiap " + pohon.getBuah().getMasaPanen() + " hari dan kamu dapat memetik buah tersebut dalam " + pohon.getBuah().getLamaBertahan() + " hari sebelum buah " + pohon.getBuah().getName() + " busuk");
            }

            System.out.println("=====================================================================================");
        } else {
            System.out.println();
            System.out.println("Maaf kamu belum mengatur musim apa yang akan berlangsung untuk pohon kehidupanmu\nAtur musim dulu gih");
        }

        System.out.println("\n\n");
        menu(pohon);
    }

    static {
        Scanner = new Scanner(System.in);
    }
}
