package lab2;

/**
 * Describe responsibilities here. The main responsibilities of the class is to
 * provide the intro to programming class information and retrieve it.
 *
 * This class achieves this by implementing all of the abstract methods from the
 * interface and writing the code for the bodies of those methods. This class is
 * an example where there are no prerequisites. In addition to these inherited
 * methods is has a few fields and methods of its own related to the raspberry
 * pi which is unique to this class.
 *
 * @author Aaron Gnas
 * @version 1.00
 */
public class IntroToProgrammingCourse implements Course {

    private String courseName;
    private String courseNumber;
    private double numberOfCreditsForCourse;
    private int totalNumberOfRaspberryPiRequiredForClass;
    private int numberOfFunctionalRaspberryPi;
    private PrintServices output;

    public IntroToProgrammingCourse(String courseName, String courseNumber, double numberOfCreditsForCourse) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.numberOfCreditsForCourse = numberOfCreditsForCourse;
        output = new PrintServices();
    }

    //a different constructor was established to show non-essential class information.
    public IntroToProgrammingCourse(int totalNumberOfRaspberryPiRequiredForClass, int numberOfFunctionalRaspberryPi) {
        this.totalNumberOfRaspberryPiRequiredForClass = totalNumberOfRaspberryPiRequiredForClass;
        this.numberOfFunctionalRaspberryPi = numberOfFunctionalRaspberryPi;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            output.performOutput("Error: courseName cannot be null or an empty string");
            System.exit(0);
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
            output.performOutput("Error: courseNumber cannot be null and must follow"
                    + "format of 111-111 or 111111.");
            System.exit(0);
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
            output.performOutput("Error: credits must be in the range 0.0 to 5.0");
            System.exit(0);
        }
        //this line had to be fixed. The previous code had recursed infinitely.
        this.numberOfCreditsForCourse = numberOfCreditsForCourse;
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

    //here is the overridden method that includes the 3 fields this class supports
    @Override
    public String getCourseDetails() {
        String courseDetails;
        courseDetails = ("Course Name: " + getCourseName()
                + "\nCourse Number: " + getCourseNumber()
                + "\nNumber of Credits: " + getNumberOfCreditsForCourse());
        return courseDetails;
    }
}
