package tugasbesar;

import java.util.ArrayList;

public class Registrasi {
    private String Username;
    private String Password;
    private String Email;
    private String Status = "pending";// pending / accepted / rejected
    private Object document;
    // buat array list untuk menyimpan data registrasi berdasarkan dokumen yang
    // sudah di upload

    // diupload
    private static ArrayList<Registrasi> registrasiList = new ArrayList<Registrasi>();

    public Registrasi(String Username, String Password, String Email, Object dokumen) {
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
        this.Status = "pending";
        // manambahkan document ke array array dokumen
        this.document = dokumen;
        registrasiList.add(this);
    }
}
