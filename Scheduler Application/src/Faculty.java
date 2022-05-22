import java.util.Random;

import java.util.ArrayList;
public class Faculty extends Person {
    
    String hireDate;
    boolean isTenured;
    String id;
    ArrayList<Course> coursesTaught;

    public Faculty() {
        super();
    }

    public Faculty(String fName, String MName, String LName, String email, String phoneNumber, String streetAddress, String city, String state, String zip, String hireDate, boolean isTenured) {
        super(fName, MName, LName, email, phoneNumber, streetAddress, city,  state, zip);
        this.hireDate = hireDate;
        this.isTenured = isTenured;
        id = super.getLName() + new Random().nextInt(100);
    }

    public Faculty(String fName, String MName, String LName, String email, String phoneNumber, String streetAddress, String city, String state, String zip, String hireDate, boolean isTenured, ArrayList<Course> coursesTaught) {
        super(fName, MName, LName, email, phoneNumber, streetAddress, city,  state, zip);
        this.hireDate = hireDate;
        this.isTenured = isTenured;
        id = super.getLName() + new Random().nextInt(100);
        this.coursesTaught = coursesTaught;
    }

    public String getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isIsTenured() {
        return this.isTenured;
    }

    public boolean getIsTenured() {
        return this.isTenured;
    }

    public void setIsTenured(boolean isTenured) {
        this.isTenured = isTenured;
    }

    public String getID() {
        return this.id;
    }

    public ArrayList<Course> getCoursesTaught() {
        return this.coursesTaught;
    }

    public void setCoursesTaught(ArrayList<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public void addCourse(Course course) {
        getCoursesTaught().add(course);
    }
    
    @Override
    public String toString() {
        return super.toString() +
            "Hire Date: \t\t" + getHireDate() + "\n" +
            "Is Tenured: \t" + isIsTenured() + "\n" +
            "ID: \t\t\t" + getID() + "\n" + 
            "Courses Taught : \n" + getCoursesTaught() + "\n";
    }

}
