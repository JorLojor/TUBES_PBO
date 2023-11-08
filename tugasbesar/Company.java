package tugasbesar;

public class Company implements Submit {
    private String nama;
    private String alamat;
    private String deskripsi;
    // register nanti disini

    // contructor
    public Company(String nama, String alamat, String deskripsi) {
        this.nama = nama;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
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
        System.out.println("Data berhasil di submit");
    }

    public void showData() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Deskripsi: " + this.deskripsi);
    }

}
