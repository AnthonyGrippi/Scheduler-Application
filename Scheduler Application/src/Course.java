import java.util.ArrayList;

public class Course {
    
    String dep;
    String code;
    String desc;
    String courseID;
    int min;
    int max;
    boolean isCanceled;
    ArrayList<Session> sessions;

    public Course() {
    }
    
    public Course(String dep, String code, String desc, int min, int max, boolean isCanceled, ArrayList<Session> sessions) {
        this.dep = dep;
        this.code = code;
        this.desc = desc;
        courseID = this.dep + this.code;
        this.min = min;
        this.max = max;
        this.isCanceled = isCanceled;
        this.sessions = sessions;
    }
    
    public String getDep() {
        return this.dep;
    }
    
    public void setDep(String dep) {
        this.dep = dep;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return this.desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public String getCourseID() {
        return this.courseID;
    }
    
    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }
    
    public int getMin() {
        return this.min;
    }
    
    public void setMin(int min) {
        this.min = min;
    }
    
    public int getMax() {
        return this.max;
    }
    
    public void setMax(int max) {
        this.max = max;
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
    
    public ArrayList<Session> getSessions() {
        return this.sessions;
    }

    public void setSessions(ArrayList<Session> sessions) {
        this.sessions = sessions;
    }

    public boolean isCourseCanceled() {
        if(getSessions().size() == 0) {
            setIsCanceled(true);
            return true;
        }
        else {
            setIsCanceled(false);
            return false;
        }
    }

    @Override
    public String toString() {
        if(!isCourseCanceled()) {
            return
            "Department: \t" + getDep() + "\n" +
            "Code: \t\t\t" + getCode() + "\n" +
            "Description: \t" + getDesc() + "\n" +
            "Course ID: \t\t" + getCourseID() + "\n" +
            "Minimum: \t\t" + getMin() + "\n" +
            "Maximum: \t\t" + getMax() + "\n" +
            "Sessions: \t" + getSessions() + "\n" + 
            "Is Canceled: \t" + isIsCanceled() + "\n\n";
        }
        else {
            return
            "Department: \t" + getDep() + "\n" +
            "Code: \t\t\t" + getCode() + "\n" +
            "Description: \t" + getDesc() + "\n" +
            "Course ID: \t\t" + getCourseID() + "\n" +
            "Minimum: \t\t" + getMin() + "\n" +
            "Maximum: \t\t" + getMax() + "\n" +
            "Course is CANCELED";
            }
        }

    }