package lab1;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * The main responsibility of this course is to acquire information related to the
 * intro to programming course and retrieve them. This is the same as the other 2 subclasses. 
 * However, what varies slightly is what this class needs to do in order to achieve that.
 *
 * IntroToProgramming has a slightly varied role than the other 2 java classes in regards
 * to the getCourseDetails method.
 * Instead of having 4 fields to gather information on using the superclass
 * concrete methods, there are only 3 fields. Once this information is obtained,
 * the course details will be retrieved using an overridden method.
 *
 *
 * @author Aaron Gnas
 * @version 1.00
 */
public class IntroToProgrammingCourse extends Course {

    private int totalNumberOfRaspberryPiRequiredForClass;
    private int numberOfFunctionalRaspberryPi;

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

    public int getTotalNumberOfRaspberryPiRequiredForClass() {
        return totalNumberOfRaspberryPiRequiredForClass;
    }

    public void setTotalNumberOfRaspberryPiRequiredForClass(int numberOfRaspberryPiRequiredForClass) {
        this.totalNumberOfRaspberryPiRequiredForClass = numberOfRaspberryPiRequiredForClass;
    }

    public int getNumberOfFunctionalRaspberryPi() {
        return numberOfFunctionalRaspberryPi;
    }

    public void setNumberOfFunctionalRaspberryPi(int numberOfFunctionalRaspberryPi) {
        this.numberOfFunctionalRaspberryPi = numberOfFunctionalRaspberryPi;
    }

    public boolean needToAcquireMoreRaspberryPi() {
        if (getNumberOfFunctionalRaspberryPi() >= getTotalNumberOfRaspberryPiRequiredForClass()) {
            return false;
        } else {
            return true;
        }
    }

}
