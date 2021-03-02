import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPerson {

    @Test
    public void affirmPersonStudent() {
        Person a = new Person("Laurent", "Bajrami", 25, Role.student);

        assertTrue(a.getName().equals("Laurent"));
        assertTrue(a.getSurname().equals("Bajrami"));
        assertTrue(a.getRole().equals(Role.student));
        assertTrue(a.getAge() == 25);
    }

    @Test
    public void affirmPersonSupervisor() {
        Person a = new Person("Laurent", "Bajrami", 25, Role.supervisor);

        assertTrue(a.getName().equals("Laurent"));
        assertTrue(a.getSurname().equals("Bajrami"));
        assertTrue(a.getRole().equals(Role.supervisor));
        assertTrue(a.getAge() == 25);
    }

}
