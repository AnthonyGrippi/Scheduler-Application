import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {        
        
        // First must create students

        // Second create an Arraylist of sessions for each course
        ArrayList<Session> cs4aSessions = new ArrayList<Session>();
        ArrayList<Session> cs1dSessions = new ArrayList<Session>();
        ArrayList<Session> math3aSessions = new ArrayList<Session>();
        ArrayList<Session> math3bSessions = new ArrayList<Session>();
        ArrayList<Session> hist16Sessions = new ArrayList<Session>();
        ArrayList<Session> hist17Sessions = new ArrayList<Session>();
        ArrayList<Session> phys4aSessions = new ArrayList<Session>();
        ArrayList<Session> phys4bSessions = new ArrayList<Session>();
        ArrayList<Session> ps14Sessions = new ArrayList<Session>();
        ArrayList<Session> mus28Sessions = new ArrayList<Session>();
        
        // Third Create course and pass the arraylist above into the constructor
        Course cs4a = new Course("CS", "4A", "Computer Science", 10, 35, false, cs4aSessions );
        Course cs1d = new Course("CS", "1D", "Computer Science", 10, 35, false, cs1dSessions );
        Course math3a = new Course("MATH", "3A", "Math", 10, 35, false, math3aSessions );
        Course math3b = new Course("MATH", "3B", "Math", 10, 35, false, math3bSessions );
        Course hist16 = new Course("HIST", "16", "History", 5, 50, false, hist16Sessions );
        Course hist17 = new Course("HIST", "17", "History", 5, 50, false, hist17Sessions );
        Course phys4a = new Course("PHYS", "4A", "Physics", 5, 50, false, physics4aSessions );
        Course phys4b = new Course("PHYS", "4B", "Physics", 5, 50, false, physics4bSessions );
        Course ps14 = new Course("PS", "14", "Political Science", 5, 50, false, ps14Sessions );
        Course mus28 = new Course("MUS", "28", "Music", 5, 50, false, ms28Sessions );

        // Create an Arraylist of students for each session
        // CS 4A Sessions
        ArrayList<Student> cs4aSession1Students = new ArrayList<Student>();
        ArrayList<Student> cs4aSession2Students = new ArrayList<Student>();
        ArrayList<Student> cs4aSession3Students = new ArrayList<Student>();
        ArrayList<Student> cs4aSession4Students = new ArrayList<Student>();
        ArrayList<Student> cs4aSession5Students = new ArrayList<Student>();
        // CS 1D Sessions
        ArrayList<Student> cs1dSession1Students = new ArrayList<Student>();
        ArrayList<Student> cs1dSession2Students = new ArrayList<Student>();
        ArrayList<Student> cs1dSession3Students = new ArrayList<Student>();
        ArrayList<Student> cs1dSession4Students = new ArrayList<Student>();
        ArrayList<Student> cs1dSession5Students = new ArrayList<Student>();
        // MATH 3A Sessions
        ArrayList<Student> math3aSession1Students = new ArrayList<Student>();
        ArrayList<Student> math3aSession2Students = new ArrayList<Student>();
        ArrayList<Student> math3aSession3Students = new ArrayList<Student>();
        ArrayList<Student> math3aSession4Students = new ArrayList<Student>();
        ArrayList<Student> math3aSession5Students = new ArrayList<Student>();
        // MATH 3B Sessions
        ArrayList<Student> math3bSession1Students = new ArrayList<Student>();
        ArrayList<Student> math3bSession2Students = new ArrayList<Student>();
        ArrayList<Student> math3bSession3Students = new ArrayList<Student>();
        ArrayList<Student> math3bSession4Students = new ArrayList<Student>();
        ArrayList<Student> math3bSession5Students = new ArrayList<Student>();
        // HIST 16 Sessions
        ArrayList<Student> hist16Session1Students = new ArrayList<Student>();
        ArrayList<Student> hist16Session2Students = new ArrayList<Student>();
        ArrayList<Student> hist16Session3Students = new ArrayList<Student>();
        ArrayList<Student> hist16Session4Students = new ArrayList<Student>();
        ArrayList<Student> hist16Session5Students = new ArrayList<Student>();
        // HIST 17 Sessions
        ArrayList<Student> hist17Session1Students = new ArrayList<Student>();
        ArrayList<Student> hist17Session2Students = new ArrayList<Student>();
        ArrayList<Student> hist17Session3Students = new ArrayList<Student>();
        ArrayList<Student> hist17Session4Students = new ArrayList<Student>();
        ArrayList<Student> hist17Session5Students = new ArrayList<Student>();
        // PHYS 4A Sessions
        ArrayList<Student> phys4aSession1Students = new ArrayList<Student>();
        ArrayList<Student> phys4aSession2Students = new ArrayList<Student>();
        ArrayList<Student> phys4aSession3Students = new ArrayList<Student>();
        ArrayList<Student> phys4aSession4Students = new ArrayList<Student>();
        ArrayList<Student> phys4aSession5Students = new ArrayList<Student>();
        // PHYS 4B Sessions
        ArrayList<Student> phys4bSession1Students = new ArrayList<Student>();
        ArrayList<Student> phys4bSession2Students = new ArrayList<Student>();
        ArrayList<Student> phys4bSession3Students = new ArrayList<Student>();
        ArrayList<Student> phys4bSession4Students = new ArrayList<Student>();
        ArrayList<Student> phys4bSession5Students = new ArrayList<Student>();
        // PS 14 Sessions
        ArrayList<Student> ps14Session1Students = new ArrayList<Student>();
        ArrayList<Student> ps14Session2Students = new ArrayList<Student>();
        ArrayList<Student> ps14Session3Students = new ArrayList<Student>();
        ArrayList<Student> ps14Session4Students = new ArrayList<Student>();
        ArrayList<Student> ps14Session5Students = new ArrayList<Student>();
        // MUS 26 Sessions
        ArrayList<Student> mus28Session1Students = new ArrayList<Student>();
        ArrayList<Student> mus28Session2Students = new ArrayList<Student>();
        ArrayList<Student> mus28Session3Students = new ArrayList<Student>();
        ArrayList<Student> mus28Session4Students = new ArrayList<Student>();
        ArrayList<Student> mus28Session5Students = new ArrayList<Student>();
        
        // add each student to the Arraylist 
        // check if the session is canceled
        // Create Sessions (5 per course)
        // CS 4A
        Session cs4aSession1 = new Session(cs4a, f, cs4aSession1Students, false);
        Session cs4aSession2 = new Session(cs4a, f, cs4aSession2Students, false);
        Session cs4aSession3 = new Session(cs4a, f, cs4aSession3Students, false);
        Session cs4aSession4 = new Session(cs4a, f, cs4aSession4Students, false);
        Session cs4aSession5 = new Session(cs4a, f, cs4aSession5Students, false);
        cs4aSessions.add(cs4aSession1);
        cs4aSessions.add(cs4aSession2);
        cs4aSessions.add(cs4aSession3);
        cs4aSessions.add(cs4aSession4);
        cs4aSessions.add(cs4aSession5);

        // CS 1D
        Session cs1dSession1 = new Session(cs1d, f, cs1dSession1Students, false);
        Session cs1dSession2 = new Session(cs1d, f, cs1dSession2Students, false);
        Session cs1dSession3 = new Session(cs1d, f, cs1dSession3Students, false);
        Session cs1dSession4 = new Session(cs1d, f, cs1dSession4Students, false);
        Session cs1dSession5 = new Session(cs1d, f, cs1dSession5Students, false);
        cs1dSessions.add(cs1dSession1);
        cs1dSessions.add(cs1dSession2);
        cs1dSessions.add(cs1dSession3);
        cs1dSessions.add(cs1dSession4);
        cs1dSessions.add(cs1dSession5);

        // MATH 3A
        Session math3aSession1 = new Session(math3a, f, math3aSession1Students, false);
        Session math3aSession2 = new Session(math3a, f, math3aSession2Students, false);
        Session math3aSession3 = new Session(math3a, f, math3aSession3Students, false);
        Session math3aSession4 = new Session(math3a, f, math3aSession4Students, false);
        Session math3aSession5 = new Session(math3a, f, math3aSession5Students, false);
        math3aSessions.add(math3aSession1);
        math3aSessions.add(math3aSession2);
        math3aSessions.add(math3aSession3);
        math3aSessions.add(math3aSession4);
        math3aSessions.add(math3aSession5);

        // MATH 3B
        Session math3bSession1 = new Session(math3b, f, math3bSession1Students, false);
        Session math3bSession2 = new Session(math3b, f, math3bSession2Students, false);
        Session math3bSession3 = new Session(math3b, f, math3bSession3Students, false);
        Session math3bSession4 = new Session(math3b, f, math3bSession4Students, false);
        Session math3bSession5 = new Session(math3b, f, math3bSession5Students, false);
        math3bSessions.add(math3bSession1);
        math3bSessions.add(math3bSession2);
        math3bSessions.add(math3bSession3);
        math3bSessions.add(math3bSession4);
        math3bSessions.add(math3bSession5);

        // HIST 16
        Session hist16Session1 = new Session(hist16, f, hist16Session1Students, false);
        Session hist16Session2 = new Session(hist16, f, hist16Session2Students, false);
        Session hist16Session3 = new Session(hist16, f, hist16Session3Students, false);
        Session hist16Session4 = new Session(hist16, f, hist16Session4Students, false);
        Session hist16Session5 = new Session(hist16, f, hist16Session5Students, false);
        hist16Sessions.add(hist16Session1);
        hist16Sessions.add(hist16Session2);
        hist16Sessions.add(hist16Session3);
        hist16Sessions.add(hist16Session4);
        hist16Sessions.add(hist16Session5);

        // HIST 17
        Session hist17Session1 = new Session(hist17, f, hist17Session1Students, false);
        Session hist17Session2 = new Session(hist17, f, hist17Session2Students, false);
        Session hist17Session3 = new Session(hist17, f, hist17Session3Students, false);
        Session hist17Session4 = new Session(hist17, f, hist17Session4Students, false);
        Session hist17Session5 = new Session(hist17, f, hist17Session5Students, false);
        hist17Sessions.add(hist17Session1);
        hist17Sessions.add(hist17Session2);
        hist17Sessions.add(hist17Session3);
        hist17Sessions.add(hist17Session4);
        hist17Sessions.add(hist17Session5);

        // PHYS 4A
        Session phys4aSession1 = new Session(phys4a, f, phys4aSession1Students, false);
        Session phys4aSession2 = new Session(phys4a, f, phys4aSession2Students, false);
        Session phys4aSession3 = new Session(phys4a, f, phys4aSession3Students, false);
        Session phys4aSession4 = new Session(phys4a, f, phys4aSession4Students, false);
        Session phys4aSession5 = new Session(phys4a, f, phys4aSession5Students, false);
        phys4aSessions.add(phys4aSession1);
        phys4aSessions.add(phys4aSession2);
        phys4aSessions.add(phys4aSession3);
        phys4aSessions.add(phys4aSession4);
        phys4aSessions.add(phys4aSession5);

        // PHYS 4B
        Session phys4bSession1 = new Session(phys4b, f, phys4bSession1Students, false);
        Session phys4bSession2 = new Session(phys4b, f, phys4bSession2Students, false);
        Session phys4bSession3 = new Session(phys4b, f, phys4bSession3Students, false);
        Session phys4bSession4 = new Session(phys4b, f, phys4bSession4Students, false);
        Session phys4bSession5 = new Session(phys4b, f, phys4bSession5Students, false);
        phys4bSessions.add(phys4bSession1);
        phys4bSessions.add(phys4bSession2);
        phys4bSessions.add(phys4bSession3);
        phys4bSessions.add(phys4bSession4);
        phys4bSessions.add(phys4bSession5);

        // PS 14
        Session ps14Session1 = new Session(ps14, f, ps14Session1Students, false);
        Session ps14Session2 = new Session(ps14, f, ps14Session2Students, false);
        Session ps14Session3 = new Session(ps14, f, ps14Session3Students, false);
        Session ps14Session4 = new Session(ps14, f, ps14Session4Students, false);
        Session ps14Session5 = new Session(ps14, f, ps14Session5Students, false);
        ps14Sessions.add(ps14Session1);
        ps14Sessions.add(ps14Session2);
        ps14Sessions.add(ps14Session3);
        ps14Sessions.add(ps14Session4);
        ps14Sessions.add(ps14Session5);

        // MUS 28
        Session mus28Session1 = new Session(mus28, f, mus28Session1Students, false);
        Session mus28Session2 = new Session(mus28, f, mus28Session2Students, false);
        Session mus28Session3 = new Session(mus28, f, mus28Session3Students, false);
        Session mus28Session4 = new Session(mus28, f, mus28Session4Students, false);
        Session mus28Session5 = new Session(mus28, f, mus28Session5Students, false);
        mus28Sessions.add(mus28Session1);
        mus28Sessions.add(mus28Session2);
        mus28Sessions.add(mus28Session3);
        mus28Sessions.add(mus28Session4);
        mus28Sessions.add(mus28Session5);
// note in courses class i must loop through each sessions element and check if it is canceled then i can cancel the course
        // once all students have been added to sessions and sessions have been canceled accordingly check if any courses have been canceled

        // Create new People both faculty and sudents
        Person p = new Person("Anthony", "J.", "Grippi", "anthonyjgrippi@gmail.com", "949-441-6667", "1402 Ave. De La Estrella", "San Clemente", "CA", "92672");
        Student s = new Student("Student", "S.", "Study", "sstudy@college.edu", "111-222-3344", "7421 Cougar Street", "Mommy City", "NV", "11113", "12/41/2042", "1/3/2060", 3.2);
        Student s2 = new Student("Silly", "C.", "Paco", "spaco@college.edu", "123-456-7890", "2313 Daddy Lane", "Goomer", "AZ", "21321", "2/12/2039", "5/23/2055", 4.0);
        Faculty f = new Faculty("Faculty", "F.", "Fack", "ffack@university.edu", "555-888-5643", "123 Elm Ave.", "Gotham", "MS", "99992", "5/13/2040", true);
        Faculty f2 = new Faculty("Teacher", "T.", "Teach", "tteach@university.edu", "675-234-4534", "158 Dog Street", "Johnas", "HW", "123542", "5/13/2040", true);

        // Creating two new Array Lists of Sessions

        // Create two Courses, Course Constructor requires an Array List of Sessions

        // Array list of sudets to add to the sessions

        // Add two students to the Array List above
        csSession1Students.add(s);
        csSession1Students.add(s2);

        // Create a new Session for the course
     
        // Check if the session is canceled
        csSession1.isSessionCanceled();

        // Print Session
        System.out.println(psys4a.toString());

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
