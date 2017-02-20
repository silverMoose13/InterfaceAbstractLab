package lab1;

import java.util.ArrayList;

/**
 *
 * @author Aaron Gnas
 */
//the purpose of this class is to take course names and add them to the
//the semester inventory database
public class College {

    private String courseName;
    private ArrayList<String> semesterInventoryDatabase;

    public College() {
        semesterInventoryDatabase = new ArrayList();
    }

    public ArrayList<String> getCourseDatabase() {
        return semesterInventoryDatabase;
    }

    public void setCourseDatabase(ArrayList<String> courseDatabase) {
        this.semesterInventoryDatabase = courseDatabase;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String addCourseNameToSemesterInventoryDatabase() {
        semesterInventoryDatabase.add(courseName);
        return "This course name has been successfully added to the semester"
                + " inventory!\n";
    }
    
    //enhanced for loop is the better choice here since we aren't looking
    //to pick out the contents of a particular index in the current responsibilities 
    //of the class.
    public String displaySemesterInventoryDatabase() {
        String line = "";
        for (String element : semesterInventoryDatabase) {
            line += element + "\n";
        }
        return line;
    }
}
