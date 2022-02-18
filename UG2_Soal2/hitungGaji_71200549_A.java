import java.util.Scanner;

public class hitungGaji_71200549_A {
    public static void main(String args[]){
        int Gaji = 300000;
        Scanner inp = new Scanner(System.in);
        System.out.print("Berapa Karyawan = ");
        int JmlLoop = inp.nextInt();
        for (int i = 1; i <= JmlLoop; i++) {
            System.out.print("Masukkan jumlah jam kerja = ");
            int totJamKerja = inp.nextInt();
            if (totJamKerja == 8) {
                System.out.println("Total: Rp. " + Gaji);
                System.out.println("---------------------");
            } else if (totJamKerja > 8){
                int extra = totJamKerja - 8;
                int extrapay = extra * 15000;
                int total = Gaji + extrapay;
                System.out.println("Extra Jam: " + extra);
                System.out.println("Extra Payments: " + extrapay);
                System.out.println("Total: Rp." + total);
                System.out.println("---------------------");
            } else if (totJamKerja < 8){
                int less = totJamKerja - 8;
                int lesspay = less * -15000;
                int total = Gaji - lesspay;
                System.out.println("Less hours: " + less * -1);
                System.out.println("Potongan: " + lesspay);
                System.out.println("Total: Rp." + total);
                System.out.println("---------------------");
            }
        }
    }
}
