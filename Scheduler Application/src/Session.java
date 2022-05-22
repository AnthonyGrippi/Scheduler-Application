import java.util.ArrayList;
import java.util.Random;

public class Session {

    Course course;
    String id;
    Faculty faculty;
    ArrayList<Student> students;
    boolean isCanceled;

    public Session() {
    }

    public Session(Course course, Faculty faculty, ArrayList<Student> students, boolean isCanceled) {
        this.course = course;
        this.id = course.getCourseID() + "_" + new Random().nextInt(100);
        this.faculty = faculty;
        this.students = students;
        this.isCanceled = isCanceled;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Faculty getFaculty() {
        return this.faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public boolean isIsCanceled() {
        return this.isCanceled;
    }

    public boolean getIsCanceled() {
        return this.isCanceled;
    }

    public void setIsCanceled(boolean isCanceled) {
        this.isCanceled = isCanceled;
    }

    public void isSessionCanceled(ArrayList<Student> students, Course course) {
        if(students.size() < course.getMin())
            setIsCanceled(true);

        else setIsCanceled(false);
    }

    public void addStudent(Student student) {
        if(getStudents().size() > getCourse().getMax())
            System.out.println("This course has a maximum of " + getCourse().getMax() + " students. STUDENT WAS NOT ADDED TO THE SESSION");

        else {
            getStudents().add(student);
            isSessionCanceled(getStudents(), getCourse());
        }

    }

    @Override
    public String toString() {
        return
            "Course: \t\t" + getCourse().getCourseID() + "\n" +
            "Session ID: \t" + getId() + "\n" +
            "Is Canceled: \t" + isIsCanceled() + "\n" +
            "Professor: \t\t" + getFaculty().getFName() + " " + getFaculty().getLName() + "\n" +
            "Students: \n" + getStudents() + "\n";
    }

}
