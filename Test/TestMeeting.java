import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMeeting {

    Meeting m = new Meeting();

    @Test
    public void testConstructor() {
        assertTrue(m.getMeeting().size() == 0);
    }

    @Test
    public void addMeeting() {
        String a1, a2, a3, a4;

        a1 = "02.01.1996";
        a2 = "07.05.1996";
        a3 = "03.01.1996";
        a4 = "02.01.1996";


        m.addMeeting(a1);
        m.addMeeting(a2);
        m.addMeeting(a3);
        m.addMeeting(a4);

        assertTrue(m.getMeeting().get(0) == "02.01.1996");
        assertTrue(m.getMeeting().get(1) == "07.05.1996");
        assertTrue(m.getMeeting().get(2) == "03.01.1996");
        assertTrue(m.getMeeting().size() == 3);

    }

}
