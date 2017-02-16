package lab1;

import java.util.ArrayList;
/**
 *
 * @author Aaron Gnas
 */
//the purpose of this class is to take course names and add them to the
//the semester inventory

public class College {

    private String courseName;
    private ArrayList<String> courseDatabase;

    public College(String courseName) {
        this.courseName = courseName;
        courseDatabase = new ArrayList();
    }
    
    public College() {}

    public ArrayList<String> getCourseDatabase() {
        return courseDatabase;
    }

    public void setCourseDatabase(ArrayList<String> courseDatabase) {
        this.courseDatabase = courseDatabase;
        System.out.println("This course name has been successfully added to the semester"
                + "inventory!");
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

}
