package lab1;

/**
 * Describe responsibilities here. The responsibility of this course is to
 * acquire the class details and display them. It achieves this by utilizing the
 * getter and setter methods from the super class to enter in the details in
 * what the class has. Since prerequisites is not a feature of all classes the
 * getter and setter method for prerequisite had to be created here. Once all of
 * the details are acquired from the 4 fields, the course details will be
 * retrieved.
 *
 * @author Aaron Gnas
 * @version 1.00
 */
public class AdvancedJavaCourse extends Course {

    private String prerequisites;
    private PrintServices output;

    public AdvancedJavaCourse(String courseName, String courseNumber, double numberOfCreditsForCourse, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setNumberOfCreditsForCourse(numberOfCreditsForCourse);
        this.prerequisites = prerequisites;
        output = new PrintServices();
    }

    //there are only 2 classes at this point that use prereqs so it is cleaner to just leave it
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            output.performOutput("Error: prerequisites cannot be null or an empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    //here is the overridden method that includes the 4 fields this class supports
    @Override
    public String getCourseDetails() {
        String courseDetails;
        courseDetails = ("Course Name: " + getCourseName()
                + "\nCourse Number: " + getCourseNumber()
                + "\nNumber of Credits: " + getNumberOfCreditsForCourse()
                + "\nPrerequisites: " + getPrerequisites());
        return courseDetails;
    }

}
