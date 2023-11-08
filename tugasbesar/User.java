package tugasbesar;

public abstract class User {
    // atribut
    private int id;
    private String Username;
    private String Password;
    private String Email;

    // contructor
    public User(int id, String Username, String Password, String Email) {
        this.id = id;
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
    }

    // getter
    public int getId() {
        return id;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    // setter

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    // method

    public abstract void login();

    public abstract void logout();
}
