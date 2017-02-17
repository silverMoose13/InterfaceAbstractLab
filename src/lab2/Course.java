package lab2;

/**
 *
 * @author Aaron Gnas
 */
//This class has methods below that are common to all the subclasses
//They are abstract because this is an interface
public interface Course {

    //is calling the abstract getters necessary here since they will
    //be all the same? Or is the point to outline all the common methods
    //to be used for the programmer to know oh I need to add these classes per minimum.
    public abstract String getCourseName();
    public abstract void setCourseName(String courseName);
    public abstract String getCourseNumber();
    public abstract void setCourseNumber(String courseNumber);
    public abstract double getNumberOfCreditsForCourse();
    public abstract void setNumberOfCreditsForCourse(double numberOfCreditsForCourse);
    public abstract String displayCourseDetails();
    
    
}
