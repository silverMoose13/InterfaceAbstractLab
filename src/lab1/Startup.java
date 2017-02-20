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

        //this will print out the semester inventory database
        output.performOutput("List of courses in the semester inventory "
                + "database: \n" + addCourse.displaySemesterInventoryDatabase());

        //this last output is for the other unique methods from the course classes. 
        //It isn't pertinent to the course details above.
        //Just showing that the other unique methods the classes have are outputting
        //properly
        output.performOutput("--------Other Class Information--------");
        IntroJavaCourse contentProgress = new IntroJavaCourse(true);
        output.performOutput("Intro to Java class is ready for their final project"
                + " part A to be assigned: " + contentProgress.readyToAssignPartAOfIntroToJavaFinalProjectToClass());
        
        IntroToProgrammingCourse materialCheck = new IntroToProgrammingCourse(15, 22);
        output.performOutput("There are enough functional raspberry pi available to"
                + " the class in order to start teaching the students how to use them: "
                + materialCheck.needToAcquireMoreRaspberryPi());
        
        AdvancedJavaCourse encapCheck = new AdvancedJavaCourse(true);
        output.performOutput("The students are ready to be assigned all the encapsulation labs"
                + " for homework: " + encapCheck.isCompletedTeachingEncapsulationUnit());

    }

}
