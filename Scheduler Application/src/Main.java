import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        // Create new People both faculty and sudents
        Person p = new Person("Anthony", "J.", "Grippi", "anthonyjgrippi@gmail.com", "949-441-6667", "1402 Ave. De La Estrella", "San Clemente", "CA", "92672");
        Student s = new Student("Student", "S.", "Study", "sstudy@college.edu", "111-222-3344", "7421 Cougar Street", "Mommy City", "NV", "11113", "12/41/2042", "1/3/2060", 3.2);
        Student s2 = new Student("Silly", "C.", "Paco", "spaco@college.edu", "123-456-7890", "2313 Daddy Lane", "Goomer", "AZ", "21321", "2/12/2039", "5/23/2055", 4.0);
        Faculty f = new Faculty("Faculty", "F.", "Fack", "ffack@university.edu", "555-888-5643", "123 Elm Ave.", "Gotham", "MS", "99992", "5/13/2040", true);
        Faculty f2 = new Faculty("Teacher", "T.", "Teach", "tteach@university.edu", "675-234-4534", "158 Dog Street", "Johnas", "HW", "123542", "5/13/2040", true);

        // Creating two new Array Lists of Sessions
        ArrayList<Session> csSessions = new ArrayList<Session>();
        ArrayList<Session> physicsSessions = new ArrayList<Session>();

        // Create two Courses, Course Constructor requires an Array List of Sessions
        Course cs1D = new Course("CS", "1D", "Computer Science", 10, 35, false, csSessions );
        Course psys4a = new Course("PSYS", "4A", "Physics", 5, 50, false, physicsSessions );

        // Array list of sudets to add to the sessions
        ArrayList<Student> csSession1Students = new ArrayList<Student>();

        // Add two students to the Array List above
        csSession1Students.add(s);
        csSession1Students.add(s2);

        // Create a new Session for the course
        Session csSession1 = new Session(cs1D, f, csSession1Students, false);
     
        // Check if the session is canceled
        csSession1.isSessionCanceled();

        // Print Session
        System.out.println(csSession1.toString());

        //Session s1 = new Session(c1, f, students, false);

        //System.out.println(p.toString() + "\n");
        //System.out.println(s.toString());
        //System.out.println(s2.toString());
        //System.out.println(f.toString());
        //System.out.println(f2.toString());

        //System.out.println(c1.toString());
        //System.out.println(c2.toString());


    }
}
