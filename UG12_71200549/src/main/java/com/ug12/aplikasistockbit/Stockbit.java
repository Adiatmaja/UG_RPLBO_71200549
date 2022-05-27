package com.ug12.aplikasistockbit;

import java.util.ArrayList;

public class Stockbit {
    private ArrayList<Investor> arrInvestor;
    private Investor investor;

    public Stockbit(){
        arrInvestor = new ArrayList<Investor>();
    }

    public void register(Investor investor){
        arrInvestor.add(investor);
        System.out.println("Registrasi akun atas nama " + investor.getNama() + " sukses!");
    }

    public void login(String username, String password){
        boolean StatusLogin = false;
        for (Investor i : arrInvestor){
            if (i.getUsername().equals(username) && i.getPassword().equals(password)){
                this.investor = i;
                StatusLogin = true;
            }
        } if (!StatusLogin){
            System.out.println("Username / Password anda salah");
        } else {
            System.out.println("Login Berhasil");
        }
    }

    public void orderBeli(Saham saham, int lot){
        investor.getPortfolio().put(saham, lot);
        System.out.println("Order beli " + saham.getKode() + " sebanyak "+ lot + " lot sukses!");
    }

    public void orderJual(Saham saham, int lot) {
        if (lot < investor.getPortfolio().get(saham)) {
            investor.getPortfolio().put(saham, investor.getPortfolio().get(saham) - lot);
            System.out.println("Order jual " + saham.getKode() + " sebanyak " + lot + " lot sukses!");
        } else if (lot == investor.getPortfolio().get(saham)) {
            investor.getPortfolio().remove(saham);
            System.out.println("Order jual " + saham.getKode() + " sebanyak " + lot + " lot sukses!");
        } else {
            System.out.println("Order jual gagal!");
        }
    }

    public void printPortfolio(){
        int i = 1;
        int TotalHarga = 0;
        System.out.println("--------- Portfolio Client ---------");
        System.out.println("Client: " + investor.getNama());
        System.out.println("No. \tKode Saham\t Jumlah Lot \tHarga \tSub Total");
        for(Saham key : investor.getPortfolio().keySet()){
            long subTotal = ((investor.getPortfolio().get(key)) * 100 * key.getHarga());
            TotalHarga += subTotal;
            System.out.println(i + "\t\t" + key.getKode() + "\t\t\t" + investor.getPortfolio().get(key) + "\t\t\t" + key.getHarga() + "\t" + subTotal);
            i++;
        }

        System.out.println("Total investasi: Rp. " + TotalHarga);
    }
}
