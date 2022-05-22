import java.util.Random;
import java.util.ArrayList;

public class Student extends Person{

    String dob;
    String attendanceDate;
    double gpa;
    String id;
    ArrayList<Course> courses;

    
    public Student() {
        super();
    }

    public Student(String fName, String MName, String LName, String email, String phoneNumber, String streetAddress, String city, String state, String zip, String dob, String attendanceDate, double gpa) {
        super(fName, MName, LName, email, phoneNumber, streetAddress, city,  state, zip);
        this.dob = dob;
        this.attendanceDate = attendanceDate;
        this.gpa = gpa;
        id = super.getLName() + new Random().nextInt(100);
    }

    public Student(String fName, String MName, String LName, String email, String phoneNumber, String streetAddress, String city, String state, String zip, String dob, String attendanceDate, double gpa, ArrayList<Course> courses) {
        super(fName, MName, LName, email, phoneNumber, streetAddress, city,  state, zip);
        this.dob = dob;
        this.attendanceDate = attendanceDate;
        this.gpa = gpa;
        id = super.getLName() + new Random().nextInt(100);
        this.courses = courses;
    }
    
    public String getDob() {
        return this.dob;
    }
    
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAttendanceDate() {
        return this.attendanceDate;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }
    
    public double getGpa() {
        return this.gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public String getID() {
        return this.id;
    }
    
    public ArrayList<Course> getCourses() {
        return this.courses;
    }
    
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        getCourses().add(course);
    }

    @Override
    public String toString() {
        return super.toString() +
        "Date of Birth: \t" + getDob() + "\n" +
        "Start Date: \t" + getAttendanceDate() + "\n" +
        "GPA: \t\t\t" + getGpa() + "\n" +
        "ID: \t\t\t" + getID() + "\n" +
        "Courses: \n" + getCourses() + "\n";
    }

}
