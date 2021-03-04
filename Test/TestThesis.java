import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestThesis {

    Thesis thesis = new Thesis();

    @Test
    public void testAddSupervisor() {
        Person p1 = new Person("A", "B", 33, Role.supervisor);
        Person p2 = new Person("B", "B", 37, Role.supervisor);
        Person p3 = new Person("C", "B", 27, Role.student); // Imposter
        Person p4 = new Person("D", "B", 30, Role.supervisor);

        // Test constructor
        thesis.addSupervisor(p1);
        Person person1 = thesis.getSupervisors().get(0);
        assertTrue(person1.getName() == "A" && person1.getSurname() == "B" &&
                person1.getRole() == Role.supervisor && person1.getAge() == 33);

        // Test for quantity
        thesis.addSupervisor(p2);
        thesis.addSupervisor(p3); // Try to force wrong type
        assertTrue(thesis.getSupervisors().size() == 2);

        // Test that we can't add more than three supervisors
        thesis.addSupervisor(p4);
        assertTrue(thesis.getSupervisors().size() == 3);
    }

    @Test
    public void testAddStudent() {
        Person p5 = new Person("A", "B", 33, Role.student);
        Person p6 = new Person("B", "B", 33, Role.student);
        Person p7 = new Person("D", "B", 33, Role.supervisor); // Imposter

        thesis.addStudent(p5);
        thesis.addStudent(p6);
        thesis.addStudent(p7); // Try to force wrong type

        assertTrue(thesis.getStudents().size() == 2);
    }


    /* Because of method-overloading (addMeeting having two versions)
    we have to test each 'version' of that method */
    @Test
    public void testAddMeeting1() {
        Meeting m1 = new Meeting("04.03.2021");
        Meeting m2 = new Meeting("05.03.2021");
        Meeting m3 = new Meeting("04.03.2021");

        thesis.addMeeting(m1);
        thesis.addMeeting(m2);
        thesis.addMeeting(m3);

        assertTrue(thesis.getMeetings().size() == 2);
    }

    @Test
    public void testAddMeeting2() {
        thesis.addMeeting("02.01.1996");
        thesis.addMeeting("03.01.1996");
        thesis.addMeeting("02.01.1996");

        assertTrue(thesis.getMeetings().size() == 2);
    }


}
