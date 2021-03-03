import java.util.ArrayList;
import java.util.List;

public class Meeting {
    private List<String> meeting;

    public Meeting() {
        this.meeting = new ArrayList<>();
    }

    public List<String> getMeeting() {
        return meeting;
    }

    public void addMeeting(String meeting) {
        if (!this.meeting.contains(meeting)) {
            this.meeting.add(meeting);
        }
    }


    private boolean contains(String string) {
        boolean doesContainVal = false;
        for (int i = 0; i < meeting.size(); i++) {
            if (meeting.get(i) == string) {
                doesContainVal = true;
            }
        }
        return doesContainVal;
    }

}
