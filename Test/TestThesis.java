import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestThesis {

    Thesis a = new Thesis();

    @Test
    public void testAddSupervisor() {
        Person p1 = new Person("A", "B", 33, Role.supervisor);
        Person p2 = new Person("B", "B", 33, Role.supervisor);
        Person p3 = new Person("D", "B", 33, Role.student);
        Person p4 = new Person("D", "B", 33, Role.supervisor);

        a.addSupervisor(p1);
        a.addSupervisor(p2);
        a.addSupervisor(p3); // Try to force wrong type

        assertTrue(a.getSupervisors().size() == 2);

        // Test that we can't add more than three supervisors
        a.addSupervisor(p4);
        assertTrue(a.getSupervisors().size() == 3);
    }

    @Test
    public void testAddStudent() {
        Person p5 = new Person("A", "B", 33, Role.student);
        Person p6 = new Person("B", "B", 33, Role.student);
        Person p7 = new Person("D", "B", 33, Role.supervisor);

        a.addStudent(p5);
        a.addStudent(p6);
        a.addStudent(p7); // Try to force wrong type

        assertTrue(a.getStudents().size() == 2);
    }

    

}
