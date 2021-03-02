import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestThesis {

    Thesis a = new Thesis();

    @Test
    public void affirmCorrectNumberOfPersons() {
        assertTrue(a.getStudents().length == 2);
        assertTrue(a.getSupervisors().length == 3);
    }

    @Test
    public void affirmCorrectNumberOfMeetings() {
        assertTrue(a.getMeetings().length == 10);
    }

}
