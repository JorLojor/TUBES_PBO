package tugasbesar;

public class SubmitDocumentViewer {
    private int ID_viewer;
    private String CompanytoApply;
    private String alasan;
    private String alamat;
    private String posisi;
    private String[] skill;

    public SubmitDocumentViewer(int ID_viewer, String CompanytoApply, String alasan, String alamat, String posisi,
            String[] skill) {
        this.ID_viewer = ID_viewer;
        this.CompanytoApply = CompanytoApply;
        this.alasan = alasan;
        this.alamat = alamat;
        this.posisi = posisi;
        this.skill = skill;
    }

    // getter
    public int getID_viewer() {
        return ID_viewer;
    }

    public String getCompanytoApply() {
        return CompanytoApply;
    }

    public String getAlasan() {
        return alasan;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getPosisi() {
        return posisi;
    }

    public String[] getSkill() {
        return skill;
    }

    // setter

    public void setID_viewer(int ID_viewer) {
        this.ID_viewer = ID_viewer;
    }

    public void setCompanytoApply(String CompanytoApply) {
        this.CompanytoApply = CompanytoApply;
    }

    public void setAlasan(String alasan) {
        this.alasan = alasan;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }

    // method

    public void showDocumentSubmit() {
        System.out.println("Alasan: " + this.alasan);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Posisi: " + this.posisi);
        System.out.print("Skill: ");
        for (String skill : this.skill) {
            System.out.print(skill + ", ");
        }
        System.out.println();
    }
}
