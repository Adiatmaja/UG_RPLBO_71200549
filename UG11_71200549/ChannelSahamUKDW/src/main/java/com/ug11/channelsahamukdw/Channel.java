package com.ug11.channelsahamukdw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Channel {
    private String email;
    private String namaDepan;
    private String namaBelakang;
    private Integer totalTag;

    public Channel(){

    }

    public void login(String email) throws EmailException{
        this.email = email;

        try {
            if (email.matches("(.*)@students.ukdw.ac.id") == false) {
                throw new EmailException(1);
            } else if (email.matches("(.*)[.](.*)@(.*)") == false){
                throw new EmailException(2);
            } else {
                System.out.println("login berhasil");
            }
        } catch (EmailException error){
            System.out.println("Error: " + error.getErrorMessage());
        }
    }

    public void bagikanIde (String p) {
        int total = 0;
        String tag = "";
        System.out.println("Ide: " + p);
        StringBuilder sb = new StringBuilder();
        String[] arrOfStr = p.split(" ");
        for (String a : arrOfStr) {
            Pattern att = Pattern.compile("^#(.+)");
            Matcher menti = att.matcher(a);
            if (menti.matches() == true) {
                sb.append(tag);
                tag = ", ";
                sb.append(a);
                this.totalTag += 1;
                total++;
            }
        }
        if (this.totalTag == null) {
            System.out.println("Saham yang anda mention: -");
            System.out.println("Total saham yang anda tag: " + total);

        } else {
            System.out.println("Saham yang anda mention: " + tag);
            System.out.println("Total saham yang anda tag: " + total);
        }
    }

    public void printInfo(){
        String[] emailSplit=this.email.split("@");
        String[] namaSplit=emailSplit[0].split("[.]");
        this.namaDepan=namaSplit[0];
        this.namaBelakang=namaSplit[1];
        System.out.println("Nama depan: " + namaSplit[0].toUpperCase());
        System.out.println("Nama belakang: " + namaSplit[1].toUpperCase());
        System.out.println("Email: "+ email);
        System.out.println("Total tag: "+ totalTag);
    }

}
