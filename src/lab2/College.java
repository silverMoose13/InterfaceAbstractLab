/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;

/**
 *
 * @author agnas
 */
public class College {

    private String courseName;
    private ArrayList<String> courseNameDatabase;

    public College(String courseName) {
        this.courseName = courseName;
        courseNameDatabase = new ArrayList();
    }

    public College() {
    }

    public ArrayList<String> getCourseDatabase() {
        return courseNameDatabase;
    }

    public void setCourseDatabase(ArrayList<String> courseDatabase) {
        this.courseNameDatabase = courseDatabase;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String addCourseNameToDatabase() {
        courseNameDatabase.add(courseName);
        return "This course name has been successfully added to the semester"
                + " inventory!\n";
    }

    //enhanced for loop is the better choice here since we aren't looking
    //to pick out the contents of a particular index in the current responsibilities of the class
    public String displayCourseNameDatabase() {
//        for (int index = 0; index < courseNameDatabase.size(); index++) {
//            System.out.println(courseNameDatabase.get(index));
//        }   
        String line = "";
        for (String element : courseNameDatabase) {
            line += element + "\n";
        }
        return line;
    }

//    public void displayCourseNameDatabase() {
//        for (int index = 0; index < courseNameDatabase.size(); index++) {
//            System.out.println(courseNameDatabase.get(index));
//        } 
}
