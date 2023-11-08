package tugasbesar;

public class document {
    // atribut
    private int ID_document;
    private String nama;
    private String bidang_keahlian;
    private int Job_experience; // menunjukkan pengalaman kerja dalam tahun
    private String isi; // menunjukkan isi dari dokumen lamaran
    // contructor

    public document(int ID_document, String nama, String bidang_keahlian, int Job_experience, String isi) {
        this.ID_document = ID_document;
        this.nama = nama;
        this.bidang_keahlian = bidang_keahlian;
        this.Job_experience = Job_experience;
        this.isi = isi;
    }

    // getter
    public int getID_document() {
        return ID_document;
    }

    public String getNama() {
        return nama;
    }

    public String getBidang_keahlian() {
        return bidang_keahlian;
    }

    public int getJob_experience() {
        return Job_experience;
    }

    public String getIsi() {
        return isi;
    }

    // setter

    public void setID_document(int ID_document) {
        this.ID_document = ID_document;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBidang_keahlian(String bidang_keahlian) {
        this.bidang_keahlian = bidang_keahlian;
    }

    public void setJob_experience(int Job_experience) {
        this.Job_experience = Job_experience;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    // method

    public void submitDocument() {
        System.out.println("Submit document");
        // yang nantinya digunakan untuk mengirim dokumen lamaran dari class Document
    }

    
}
