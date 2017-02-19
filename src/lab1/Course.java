package lab1;

//the overall responsibility of this class is to provide a few
//basic methods that set and retrieve the courseName, courseNumber, and credits.
//It also has the capability to display the course details which will be abstract
//since not every class has the same fields.
public abstract class Course {

    //members are all set to private now as they weren't before.
    private String courseName;
    private String courseNumber;
    //refactored the name of this member as credits wasn't descriptive enough
    private double numberOfCreditsForCourse;
    private PrintServices output;

    public Course() {
        output = new PrintServices();
    }

    public String getCourseName() {
        return courseName;
    }

    //The setter for course name should always stay this way. This is why I have 
    //moved it to the abstract class Course. However, it is
    //not set to final because the course name could change in time.
    public void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            output.performOutput("Error: courseName cannot be null or an empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    //The setter for course number will always be written this way and won't change.
    //As a result, it is set to final and placed in the abstract superclass Course.
    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() < 6 || courseNumber.length() > 7) {
            output.performOutput("Error: courseNumber cannot be null and must follow"
                    + "format of 111-111 or 111111.");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getNumberOfCreditsForCourse() {
        return numberOfCreditsForCourse;
    }

    //make this a concrete method in the super class. Credits will change
    //but the body of the method won't
    public final void setNumberOfCreditsForCourse(double numberOfCreditsForCourse) {
        if (numberOfCreditsForCourse < 0.0 || numberOfCreditsForCourse > 5.0) {
            output.performOutput("Error: credits must be in the range 0.0 to 5.0");
            System.exit(0);
        }
        //this line had to be fixed. The previous code had recursed infinitely.
        this.numberOfCreditsForCourse = numberOfCreditsForCourse;
    }

    //This is abstract since not all classes will have the same details printing
    //For example, intro to programming does not have a prerequisite
    //In addition this is also abstract because down the road as more classes
    //get added, there may be even more fields and variability that are unique
    //to certain subclasses
    public abstract String getCourseDetails();

}
