package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {

    public List<Attending> getAttending(){

        List<Attending> attending = new ArrayList<Attending>();

        File file = new File("/Users/johnsonadeshina/IdeaProjects/SchoolManagementSystem1/src/attending.csv");

        Scanner in;
        try {
            in = new Scanner(file);
            String[] txtLine;
            while (in.hasNextLine()) {
                txtLine = in.nextLine().split(",");
                attending.add(new Attending(Integer.parseInt(txtLine[0]), txtLine[1]));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return attending;
    }

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){

        int loginFound = 0;

        for(Attending att : attending)
        {
            if(att.getStudentEmail().equals(studentEmail)&& att.getCourseID()==courseID)
            {
                loginFound++;

            }

        }
        if(loginFound==1) {
            System.out.println("Already registered");
        }
        else if(loginFound==0) {
            attending.add(new Attending(courseID,studentEmail));
            saveAttending(attending);

        }
    }

    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){

        List<Course> newCourseList = new ArrayList<>();


        for(Attending att : attending)
        {
            if(att.getStudentEmail().equals(studentEmail))

                for(Course crs : courseList)
                {

                    if(att.getCourseID()==crs.getCourseID()) {

                        newCourseList.add(new Course(crs.getCourseID(), crs.getCourseName(), crs.getInstructor()));
                    }

                }
        }

        return newCourseList;
    }

    public void saveAttending(List<Attending> attending){

        String location = "/Users/johnsonadeshina/IdeaProjects/SchoolManagementSystem1/src/attending.csv";
        File file = new File(location);
        try {
            FileWriter writer = new FileWriter(file,false);

            for(Attending att : attending)
            {
                String s = att.getCourseID() + "," + att.getStudentEmail() + "\n";
                writer.write(s);
            }

            writer.close();

        } catch (IOException e) {

            e.printStackTrace();
        }


    }

}
