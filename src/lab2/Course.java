package lab2;

/**
 *
 * @author Aaron Gnas
 */
//This responsibility of this class it to provide methods below that are common to all 
//the subclasses. They are abstract because this is an interface
public interface Course {

    public abstract String getCourseName();
    public abstract void setCourseName(String courseName);
    public abstract String getCourseNumber();
    public abstract void setCourseNumber(String courseNumber);
    public abstract double getNumberOfCreditsForCourse();
    public abstract void setNumberOfCreditsForCourse(double numberOfCreditsForCourse);
    public abstract String getCourseDetails();
    
    
}
