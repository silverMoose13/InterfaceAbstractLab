package lab2;

/**
 * Describe responsibilities here. The main responsibilities of the class is to
 * provide the intro to java class information and retrieve it.
 *
 * This class achieves this by implementing all of the abstract methods from the
 * interface and writing the code for the bodies of those methods. This class
 * also has a prerequisites field since not every class will have a
 * prerequisite. This class also has a unique field and method related to the
 * progression of the amount of Intro to Java content taught to the class.
 *
 * @author Aaron Gnas
 * @version 1.00
 */
public class IntroJavaCourse implements Course {

    private String courseName;
    private String courseNumber;
    private double numberOfCreditsForCourse;
    private String prerequisites;
    private boolean completedTeachingIntroToJavaContentToClass;

    public IntroJavaCourse(String courseName, String courseNumber, double numberOfCreditsForCourse, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.numberOfCreditsForCourse = numberOfCreditsForCourse;
        this.prerequisites = prerequisites;
    }

    //a difference constructor was established to show non-essential class information.
    public IntroJavaCourse(boolean completedTeachingIntroToJavaContentToClass) {
        this.completedTeachingIntroToJavaContentToClass = completedTeachingIntroToJavaContentToClass;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Error: prerequisites cannot be null or an empty string");
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null or an empty string");
        }
        this.courseName = courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() < 6 || courseNumber.length() > 7) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null "
                    + "and must follow format of 111-111 or 111111.");
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public double getNumberOfCreditsForCourse() {
        return numberOfCreditsForCourse;
    }

    @Override
    public final void setNumberOfCreditsForCourse(double numberOfCreditsForCourse) {
        if (numberOfCreditsForCourse < 0.0 || numberOfCreditsForCourse > 5.0) {
            throw new IllegalArgumentException("Error: credits must be in the range"
                    + " 0.0 to 5.0");
        }
        //this line had to be fixed. The previous code had recursed infinitely.
        this.numberOfCreditsForCourse = numberOfCreditsForCourse;
    }

    public boolean isCompletedTeachingIntroToJavaContentToClass() {
        return completedTeachingIntroToJavaContentToClass;
    }

    public void setCompletedTeachingIntroToJavaContentToClass(boolean completedTeachingIntroToJavaContentToClass) {
        this.completedTeachingIntroToJavaContentToClass = completedTeachingIntroToJavaContentToClass;
    }

    public boolean readyToAssignPartAOfIntroToJavaFinalProjectToClass() {
        if (isCompletedTeachingIntroToJavaContentToClass() == true) {
            return true;
        } else {
            return false;
        }
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
