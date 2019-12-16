package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDAO {

    public StudentDAO() {
    }

    public List<Student>  getStudents(){

        List<Student> students = new ArrayList<Student>();

        File file = new File("/Users/johnsonadeshina/IdeaProjects/SchoolManagementSystem1/src/students.csv");

        //set up for the user input
        Scanner in;
        try {
            in = new Scanner(file);
            String[] txtLine;
            while (in.hasNextLine()) {
                txtLine = in.nextLine().split(",");
                students.add(new Student(txtLine[0], txtLine[1], txtLine[2]));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return students;
    }

    public Student getStudentByEmail(List<Student> studentList, String studentEmail){

        Student list = new Student();

        for(Student e : studentList)
        {
            if(e.getEmail().equals(studentEmail))
            {
                list=e;


            }

            }
        return list;
    }
    //set up for the user for validation
    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass){

        for(Student e : studentList)
        {
            if(e.getEmail().equals(studentEmail) && e.getPass().equals(studentPass))
            {
                return true;
            }
        }
        return false;

    }
}
