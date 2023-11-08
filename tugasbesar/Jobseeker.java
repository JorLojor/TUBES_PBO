package tugasbesar;

public class Jobseeker extends User {
    private int ID_jobseeker;

    // contructor
    public Jobseeker(int id, String Username, String Password, String Email, int ID_jobseeker) {
        super(id, Username, Password, Email);
        this.ID_jobseeker = ID_jobseeker;
    }

    // getter
    public int getID_jobseeker() {
        return ID_jobseeker;
    }
    // setter

    public void setID_jobseeker(int ID_jobseeker) {
        this.ID_jobseeker = ID_jobseeker;
    }

    // method
    @Override
    public void login() {
        System.out.println("Login jobseeker");
    }

    @Override
    public void logout() {
        System.out.println("Logout jobseeker");
    }

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
        // yang nantinya digunakan untuk membuat dokumen lamaran dari class Document
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
