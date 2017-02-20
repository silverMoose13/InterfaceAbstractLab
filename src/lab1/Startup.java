package lab1;

/**
 *
 * @author Aaron Gnas
 */
//This class sets and displays the course information for the 3 programming classes
//This class also sets/adds a course to an ArrayList and returns the ArrayList.
public class Startup {

    public static void main(String[] args) {

        PrintServices output = new PrintServices();
        College addCourse = new College();

        //this will print out the basic information related to the course
        IntroToProgrammingCourse newProgCourse = new IntroToProgrammingCourse("Intro to Programming", "103-032", 3.0);
        output.performOutput(newProgCourse.getCourseDetails());
        addCourse.setCourseName("Intro To Programming");
        output.performOutput(addCourse.addCourseNameToSemesterInventoryDatabase());

        IntroJavaCourse newJavaCourse = new IntroJavaCourse("Intro to Java", "103-042", 4.0, "Intro to Programming");
        output.performOutput(newJavaCourse.getCourseDetails());
        addCourse.setCourseName("Intro To Java");
        output.performOutput(addCourse.addCourseNameToSemesterInventoryDatabase());

        AdvancedJavaCourse newAdvJavaCourse = new AdvancedJavaCourse("Advanced Java", "108-047", 4.0, "Intro to Java");
        output.performOutput(newAdvJavaCourse.getCourseDetails());
        addCourse.setCourseName("Advanced Java");
        output.performOutput(addCourse.addCourseNameToSemesterInventoryDatabase());

        output.performOutput("List of courses in the semester inventory "
                + "database: \n" + addCourse.displaySemesterInventoryDatabase());

    }

}
