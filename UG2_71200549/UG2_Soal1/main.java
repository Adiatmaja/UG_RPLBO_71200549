import java.util.Scanner;

public class main {
    public static void main(String args[]){
        TabunganKonvensional K_71200549 = new TabunganKonvensional();
        TabunganBerjangka I_71200549 = new TabunganBerjangka();
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihan :");
        System.out.println("1. Penyetoran");
        System.out.println("2. Penarikan");
        System.out.println("3. Lihat Saldo");
        System.out.println("Masukkan Pilihan :");
        for (int i = 0; i > -1; i++) {
            int pilihan = input.nextInt();
            if (pilihan == 1) {
                K_71200549.penyetoran(200000);
                I_71200549.penyetoran(1000000);
            } else if (pilihan == 2) {
                K_71200549.penarikan(50000);
                I_71200549.penarikan(0);
            } else if (pilihan == 3) {
                System.out.print("Saldo K_71200549 = " );
                K_71200549.getSaldo();
                System.out.print("Saldo K_71200549 = " );
                I_71200549.getSaldo();
            } else {
                System.out.print("Inputan tidak valid");
            }
        }
    }
}