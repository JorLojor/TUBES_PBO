package tugasbesar;

public class SubmitDocumentViewer {
    private String alasan;
    private String alamat;
    private String posisi;
    private String[] skill;

    public SubmitDocumentViewer(String alasan, String alamat, String posisi, String[] skill) {
        this.alasan = alasan;
        this.alamat = alamat;
        this.posisi = posisi;
        this.skill = skill;
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
