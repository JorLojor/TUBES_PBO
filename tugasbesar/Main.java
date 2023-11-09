package tugasbesar;

public class Main {
    public static void main(String[] args) {

        User[] userViewer = new User[5];
        userViewer[0] = new viewer(11, "lojor", "apakek", "lojor@gmail.com", 01);
        userViewer[1] = new viewer(11, "hanip", "asasa", "hanip@gmail.com", 01);
        userViewer[2] = new viewer(11, "ibrahim", "adada", "ibrahim@gmail.com", 01);
        userViewer[3] = new viewer(11, "george", "afafa", "george@gmail.com", 01);
        userViewer[4] = new viewer(11, "jor", "agaga", "jor@gmail.com", 01);

        User[] userJoobSeeker = new User[5];
        userJoobSeeker[0] = new JobSeeker(21, "si a", "aa1234", "sia@gmail.com", 31);
        userJoobSeeker[1] = new JobSeeker(21, "si b", "bb1234", "sib@gmail.com", 32);
        userJoobSeeker[2] = new JobSeeker(21, "si c", "cc1234", "sic@gmail.com", 33);
        userJoobSeeker[3] = new JobSeeker(21, "si d", "dd1234", "sid@gmail.com", 34);
        userJoobSeeker[4] = new JobSeeker(21, "si e", "ee1234", "sie@gmail.com", 35);

        Company[] userCompany = new Company[5];
        userCompany[0] = new Company("PT. A", "aa1234", "perusahaan A");
        userCompany[1] = new Company("PT. B", "bb1234", "perusahaan B");
        userCompany[2] = new Company("PT. C", "cc1234", "perusahaan C");
        userCompany[3] = new Company("PT. D", "dd1234", "perusahaan D");
        userCompany[4] = new Company("PT. E", "ee1234", "perusahaan E");

        // Recuiter
        Recuiter[] userRecuiter = new Recuiter[5];
        userRecuiter[0] = new Recuiter(41, "req1", "req1_123", "req1@gmail.com", 51);
        userRecuiter[1] = new Recuiter(41, "req2", "req2_123", "req2@gmail.com", 52);
        userRecuiter[2] = new Recuiter(41, "req3", "req3_123", "req3@gmail.com", 53);
        userRecuiter[3] = new Recuiter(41, "req4", "req4_123", "req4@gmail.com", 54);
        userRecuiter[4] = new Recuiter(41, "req5", "req5_123", "req5@gmail.com", 55);

    }
}
