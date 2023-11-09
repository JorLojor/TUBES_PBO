package tugasbesar;

import java.util.ArrayList;
import java.util.Scanner;

public class JobSeeker extends User {
    private int ID_jobseeker;

    private static ArrayList<JobSeeker> jobSeekerList = new ArrayList<JobSeeker>();

    // contructor
    public JobSeeker(int id, String Username, String Password, String Email, int ID_jobseeker) {
        super(id, Username, Password, Email);
        this.ID_jobseeker = ID_jobseeker;

        jobSeekerList.add(this);
    }

    // getter
    public int getID_jobseeker() {
        return ID_jobseeker;
    }
    // setter

    public void setID_jobseeker(int ID_jobseeker) {
        this.ID_jobseeker = ID_jobseeker;
    }

    // method override
    @Override
    public void login() {
        System.out.println("Login jobseeker");
    }

    @Override
    public void logout() {
        System.out.println("Logout jobseeker");
    }

    // methodjobseeker
    public void apply() {
        System.out.println("Apply");
        // yang nantinya digunakan untuk melamar pekerjaan dari class Company
    }

    public void DisplayCompany() {
        System.out.println("View");
        // yang nantinya digunakan untuk melihat daftar lowongan pekerjaan dari class
        // Company
    }

    public void CreteDocument() {
        System.out.println("Create document");
        int id;
        String nama;
        String alamat;
        int jobExperiece;
        String deskripsi;
        System.out.println("masukkan document anda ------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan id: ");
        id = input.nextInt();
        System.out.print("masukkan nama: ");
        nama = input.next();
        System.out.print("masukkan alamat: ");
        alamat = input.next();
        System.out.print("masukkan job experience: ");
        jobExperiece = input.nextInt();
        System.out.print("masukkan deskripsi: ");
        deskripsi = input.next();
        //

        document documant = new document(id, nama, alamat, jobExperiece, deskripsi);

        documant.submitDocument(getUsername(), getPassword(), getEmail());
        System.out.println("data berhasil di submit"); //
    }

    public void EditDocument() {
        System.out.println("Edit document");
        // yang nantinya digunakan untuk mengedit dokumen lamaran dari class Document
    }

    public void DeleteDocument() {
        System.out.println("Delete document");
        // yang nantinya digunakan untuk menghapus dokumen lamaran dari class Document
    }

    public void DisplayDocument() {
        System.out.println("View document");
        // yang nantinya digunakan untuk melihat dokumen lamaran dari class Document
    }

}
