package lab1;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * The responsibility of this course is to acquire the class details
 * and display them. This is the same as the other 2 subclasses. However, what varies
 * slightly is what this class needs to do in order to achieve that.
 * 
 * IntroToProgramming has a slightly varied role than the other 2 java classes.
 * Instead of having 4 fields to gather information on using the superclass concrete
 * methods, there are only 3 fields. Once this information is obtained, the course details
 * will be retrieved using an overridden method.
 * 
 * @author Aaron Gnas
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Course {

    public IntroToProgrammingCourse(String courseName, String courseNumber, double numberOfCreditsForCourse) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setNumberOfCreditsForCourse(numberOfCreditsForCourse);
    }

    //this class has only 3 fields it needs to use
    @Override
    public String getCourseDetails() {
        String courseDetails;
        courseDetails = ("Course Name: " + getCourseName()
                + "\nCourse Number: " + getCourseNumber()
                + "\nNumber of Credits: " + getNumberOfCreditsForCourse());
        return courseDetails;
    }

}
