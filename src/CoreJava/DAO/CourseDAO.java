package CoreJava.DAO;

import CoreJava.Models.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDAO {


    public List<Course> getAllCourses(){

        List<Course> course = new ArrayList<Course>();

        File file = new File("/Users/johnsonadeshina/IdeaProjects/SchoolManagementSystem1/src/courses.csv");

        Scanner in;
        try {
            in = new Scanner(file);
            String[] txtLine;
            while (in.hasNextLine()) {
                txtLine = in.nextLine().split(",");
                course.add(new Course(Integer.parseInt(txtLine[0]), txtLine[1], txtLine[2]));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return course;

    }
}
