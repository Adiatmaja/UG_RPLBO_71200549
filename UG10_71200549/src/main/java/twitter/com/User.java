package twitter.com;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class User {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;


    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public static void main( String[] args ) {
        User user = new User("u71190480", "p71190480");

        System.out.println("Selamat datang di Twitter!");
        System.out.println("Silakan login dengan akun anda");

        boolean loggedin = false;
        boolean usernamesuccess = false;
        boolean biosuccess = false;
        boolean tweetsuccess = false;
        String nama = null;
        String biouser = null;
        String passworduser = null;

        while (loggedin == false) {
            Scanner username = new Scanner(System.in);
            System.out.print("Username : ");
            String login;
            login = username.nextLine();

            Scanner password = new Scanner(System.in);
            System.out.print("Password : ");
            String pass;
            pass = password.nextLine();

            try {
                if (login.equals(user.getUsername()) && pass.equals(user.getPassword())) {
                    System.out.println("Selamat datang di Twitter, " + login);
                    loggedin = true;
                    passworduser = user.getPassword();
                } else if (login.length() == 0 && pass.length() == 0){
                    throw new LoginException(4);
                } else if (login.length() == 0){
                    throw new LoginException(1);
                } else if (pass.length() == 0){
                    throw new LoginException(2);
                } else {
                    throw new LoginException(3);
                }
            } catch (LoginException log) {
                System.out.println(log.getErrMessage());
            }
        }
        System.out.println("Kamu diminta untuk mengganti username, silakan masukkan username kamu");

        while (usernamesuccess == false){
            Scanner username = new Scanner(System.in);
            System.out.print("Username Baru : ");
            String newusername;
            newusername = username.nextLine();

            try {
                if (newusername.length() == 0) {
                    throw new UsernameException(1);
                } else if (newusername.length() < 6){
                    throw new UsernameException(2);
                } else {
                    System.out.println("Username kamu berhasil diperbarui, " + newusername);
                    usernamesuccess = true;
                    nama = newusername;
                }
            } catch (UsernameException log) {
                System.out.println(log.getMessage());
            }
        }
        System.out.println("Maaf, " + nama + " kamu juga diminta untuk mengisi bio, silakan masukkan bio kamu");

        while (biosuccess == false){
            Scanner setbio = new Scanner(System.in);
            System.out.print("Bio : ");
            String bio;
            bio = setbio.nextLine();

            try {
                if (bio.length() == 0) {
                    throw new BioException(1);
                } else if (bio.length() < 6){
                    throw new BioException(2);
                } else {
                    System.out.println("Bio kamu berhasil diperbarui, " + bio);
                    biosuccess = true;
                    biouser = bio;
                }
            } catch (BioException log) {
                System.out.println(log.getMessage());
            }
        }
        System.out.println("Selamat, " + nama + " kamu sudah dapat memposting tweet pertama kamu");

        while (tweetsuccess == false){
            Scanner settweet = new Scanner(System.in);
            System.out.print("Tweet : ");
            String tweet;
            tweet = settweet.nextLine();

            try {
                if (tweet.length() == 0) {
                    throw new TweetException(1);
                } else if (tweet.length() > 140 || tweet.length() < 8){
                    throw new TweetException(2);
                } else {
                    System.out.println(nama + ": " + tweet);
                    tweetsuccess = true;
                }
            } catch (TweetException log) {
                System.out.println(log.getMessage());
            }
        }
        System.out.println("Username = " + nama);
        System.out.println("Password = " + passworduser);
        System.out.println("Bio = " + biouser);
    }
}
