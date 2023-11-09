package tugasbesar;

import java.util.ArrayList;

public class viewer extends User {
    // atribut
    private int ID_viewer;

    private static ArrayList<viewer> viewerList = new ArrayList<viewer>();

    // contructor
    public viewer(int id, String Username, String Password, String Email, int ID_viewer) {
        super(id, Username, Password, Email);
        this.ID_viewer = ID_viewer;

        viewerList.add(this);
    }

    // getter
    public int getID_viewer() {
        return ID_viewer;
    }

    // setter
    public void setID_viewer(int ID_viewer) {
        this.ID_viewer = ID_viewer;
    }

    // method
    @Override
    public void login() {
        System.out.println("Login viewer");
    }

    @Override
    public void logout() {
        System.out.println("Logout viewer");
    }

    public void DisplayCompany() {
        System.out.println("View");
        // yang nantinya digunakan untuk melihat daftar lowongan pekerjaan dari class
        // Company
    }

}
