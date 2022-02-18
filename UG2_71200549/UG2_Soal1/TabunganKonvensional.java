public class TabunganKonvensional {
    private String pemilik;
    private double saldo;

    public void getSaldo(){
        System.out.println(saldo);
    }
    public void penarikan(double jumlah){
        saldo = saldo - jumlah;
        System.out.println("-----Tabungan Konvensional-----");
        System.out.println("Penarikan Rp. 50000");
    }
    public void penyetoran(double jumlah){
        saldo = saldo + jumlah;
        System.out.println("-----Tabungan Konvensional-----");
        System.out.println("Penyetoran Rp. 200000");
    }
}
