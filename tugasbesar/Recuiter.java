package tugasbesar;

import java.util.Scanner;
import java.util.ArrayList;

public class Recuiter extends User {
    private int ID_recuiter;
    private static ArrayList<Recuiter> recuiterList = new ArrayList<Recuiter>();

    public Recuiter(int id, String Username, String Password, String Email, int ID_recuiter) {
        super(id, Username, Password, Email);
        this.ID_recuiter = ID_recuiter;

        recuiterList.add(this);
    }

    public int getID_recuiter() {
        return ID_recuiter;
    }

    public void setID_recuiter(int ID_recuiter) {
        this.ID_recuiter = ID_recuiter;
    }

    // override method from User.java
    @Override
    public void login() {
        for (int i = 0; i < 4; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            input.close();

            for (Recuiter viewer : recuiterList) {
                if (viewer.getUsername().equals(username) && viewer.getPassword().equals(password)) {
                    System.out.println("Login berhasil");
                    setStatus("online");
                    return;
                } else {
                    System.out.println("Username atau password salah silahkan coba lagi");

                }
            }

        }

    }

    @Override
    public void logout() {
        Scanner input = new Scanner(System.in);
        System.out.print("Apakah anda yakin ingin logout? (y/n): ");
        String logout = input.nextLine();
        input.close();

        if (logout.equals("y")) {
            setStatus("offline");
        } else {
            System.out.println("Batal logout");
        }
    }

    public void sendInvoice() {
        System.out.println("Send Invoice");
        // yang nantinya digunakan untuk mengirim invoice ke jobseeker
    }

    public void displayRegistJobseeker() {
        System.out.println("Display Regist Jobseeker");
        // yang nantinya digunakan untuk melihat daftar jobseeker yang sudah mendaftar
        // ke perusahaan
    }

}
