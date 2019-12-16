package CoreJava.Models;

public class Attending {

    // Variables declaration
    private int courseID;
    private String studentEmail;


    // Default constructor
    public Attending() {
    }

    public Attending(int courseID, String studentEmail) {
        this.courseID = courseID;
        this.studentEmail = studentEmail;
    }

    // Getter and Setter methods for the Attending class
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }



}
