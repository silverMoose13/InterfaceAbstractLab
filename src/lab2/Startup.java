/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author agnas
 *
 * //This class sets and displays the course information for the 3 programming
 * classes //This class also sets/adds a course to an ArrayList and returns the
 * ArrayList.
 */
public class Startup {

    public static void main(String[] args) {

        PrintServices output = new PrintServices();

        IntroToProgrammingCourse newProgCourse = new IntroToProgrammingCourse("Intro to Programming", "152-432", 3.0);
        output.performOutput(newProgCourse.getCourseDetails());

        IntroJavaCourse newJavaCourse = new IntroJavaCourse("Intro to Java", "152-052", 4.0, "Intro to Programming\n");
        output.performOutput("\n" + newJavaCourse.getCourseDetails());

        AdvancedJavaCourse newAdvJavaCourse = new AdvancedJavaCourse("Advanced Java", "152-068", 4.0, "Intro to Java\n");
        output.performOutput(newAdvJavaCourse.getCourseDetails());

        College addCourse = new College("Intro to Java");
        output.performOutput(addCourse.addCourseNameToSemesterInventoryDatabase());
        output.performOutput("List of courses in the semester inventory database: \n" + addCourse.displaySemesterInventoryDatabase());

    }
}
