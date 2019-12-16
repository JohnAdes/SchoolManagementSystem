package CoreJava.Models;

public class Student {

    // Variables declaration
    private String email;
    private String mame;
    private String pass;

    // Default constructor
    public Student() {
    }

    public Student(String email, String mame, String pass) {
        this.email = email;
        this.mame = mame;
        this.pass = pass;
    }

    // Getter and Setter methods for the Student class
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

