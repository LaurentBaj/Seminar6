import java.util.ArrayList;
import java.util.List;

public class Thesis {

    // Members
    private List<Person> supervisors = new ArrayList<>();
    private List<Person> students = new ArrayList<>();
    private List<Meeting> meetings = new ArrayList<>();

    // Getters
    public List<Person> getSupervisors() {
        return supervisors;
    }
    public List<Person> getStudents() {
        return students;
    }
    public List<Meeting> getMeetings() {return meetings; }


    // Methods
    public void addSupervisor(Person person) {
        if (person.getRole() == Role.supervisor && supervisors.size() < 3)
            this.supervisors.add(person);
    }
    
    public void addStudent(Person person) {
        if (person.getRole() == Role.student && students.size() < 2)
            this.students.add(person);
    }


    // I want you to be able to create a meeting either by passing a string or a Meeting object
    public void addMeeting(Meeting meeting) {
        if (meetings.size() < 10 && !doesMeetingExist(meeting))
            this.meetings.add(meeting);
    }

    public void addMeeting(String date) {
        Meeting meeting = new Meeting(date);
        addMeeting(meeting);    // Calls the first version
    }

    /* Might seem convoluted but the only thing you have to know is that it returns the proper boolean value
    * when addMeeting() checks if the meeting (being passed) exists*/
    private boolean doesMeetingExist(Meeting meeting) {
        boolean exists = false;

        for (int i = 0; i < meetings.size(); i++) {
            if (this.meetings.get(i).getDate().equals(meeting.getDate())) {
                exists = true;
            }
        }

        return exists;
    }

}
