package CoreJava.Models;

public class Course {

    // Variables declaration
    private int courseID;
    private String courseName;
    private String instructor;


    // Default constructor
    public Course() {
    }

    public Course(int courseID, String courseName, String instructor) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    // Getter and Setter methods for the Course class
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }



}
