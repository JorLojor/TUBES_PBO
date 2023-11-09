package tugasbesar;

import java.util.ArrayList;
import java.util.Scanner;

public class Company implements Submit {
    private String nama;
    private String alamat;
    private String deskripsi;
    // register nanti disini

    private static ArrayList<Company> companyList = new ArrayList<Company>();

    // contructor
    public Company(String nama, String alamat, String deskripsi) {
        this.nama = nama;
        this.alamat = alamat;
        this.deskripsi = deskripsi;

        companyList.add(this);
    }

    // getter

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    // setter

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // method

    @Override
    public void submitData() {
       
    }

    public void showData() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Deskripsi: " + this.deskripsi);
    }

}
