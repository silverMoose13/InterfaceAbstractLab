package lab1;

/**
 *
 * @author Aaron Gnas
 */
//This class sets and displays the course information for the 3 programming classes
//This class also sets/adds a course to an ArrayList and returns the ArrayList.
public class Startup {

    public static void main(String[] args) {

        IntroToProgrammingCourse newProgCourse = new IntroToProgrammingCourse("Intro to Programming", "103-032", 3.0);
        System.out.println(newProgCourse.displayCourseDetails());
        
        IntroJavaCourse newJavaCourse = new IntroJavaCourse("Intro to Java", "103-042", 4.0, "Intro to Programming\n");
        System.out.println("\n" + newJavaCourse.displayCourseDetails());
        
        AdvancedJavaCourse newAdvJavaCourse = new AdvancedJavaCourse("Advanced Java", "108-047", 4.0, "Intro to Java\n");
        System.out.println(newAdvJavaCourse.displayCourseDetails());

        College addCourse = new College("Advanced Java");
        System.out.println(addCourse.getCourseName());

    }

}
