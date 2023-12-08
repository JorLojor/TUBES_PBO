package tugasbesar;

import java.util.Scanner;
import java.util.ArrayList;

public class viewer extends User implements Submit {
    // atribut
    private int ID_viewer;
    private static ArrayList<viewer> viewerList = new ArrayList<viewer>();

    // buatlah sebuag aaraylist yang isinya object untuk di submit

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
        for (int i = 0; i < 4; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            input.close();

            for (viewer viewer : viewerList) {
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

    public void DisplayCompany() {
        try {
            for (Company company : Company.companyList) {
                company.showData();
            }
        } catch (Exception e) {
            System.out.println("Tidak ada perusahaan yang terdaftar");
        }

    }

    @Override
    public void submitData() {
    }

}
