import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestThesis {

    Thesis a = new Thesis();

    @Test
    public void affirmCorrectNumberOfUnits() {
//        assertTrue(a.getStudents().size() == 2);
//        assertTrue(a.getSupervisors().size() == 3);
//        assertTrue(a.getMeetings().size() == 10);
    }

    @Test
    public void testAddSupervisor() {
        Person p1 = new Person("A", "B", 33, Role.supervisor);
        Person p2 = new Person("B", "B", 33, Role.supervisor);
        Person p3 = new Person("D", "B", 33, Role.student);

        a.addSupervisor(p1);
        a.addSupervisor(p2);
        a.addSupervisor(p3);

        assertTrue(a.getSupervisors().size() == 2);
    }

}
