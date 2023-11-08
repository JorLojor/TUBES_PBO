package tugasbesar;

public class Recuiter extends User {
    private int ID_recuiter;

    public Recuiter(int id, String Username, String Password, String Email, int ID_recuiter) {
        super(id, Username, Password, Email);
        this.ID_recuiter = ID_recuiter;
    }

    public int getID_recuiter() {
        return ID_recuiter;
    }

    public void setID_recuiter(int ID_recuiter) {
        this.ID_recuiter = ID_recuiter;
    }

    @Override
    public void login() {
        System.out.println("Login recuiter");
    }

    @Override
    public void logout() {
        System.out.println("Logout recuiter");
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
