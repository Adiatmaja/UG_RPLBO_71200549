public class TabunganBerjangka {
    private String pemilik;
    private double saldo;

    public void getSaldo(){
        System.out.println(saldo);
    }
    public void penarikan(double jumlah){
        System.out.println("-----Tabungan Berjangka-----");
        System.out.println("Belum Jatuh Tempo");
    }
    public void penyetoran(double jumlah){
        saldo = saldo + jumlah;
        System.out.println("-----Tabungan Berjangka-----");
        System.out.println("Penyetoran Rp. 1000000");
    }
}
