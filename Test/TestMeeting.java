import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMeeting {

    @Test
    public void testConstructor() {
        Meeting m1 = new Meeting("02.01.1996");

        assertEquals(m1.getDate(), "02.01.1996");
    }

}
