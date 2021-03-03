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
    public List<Meeting> getMeetings() {
        return meetings;
    }
    

    // Methods
    public void addSupervisor(Person person) {
        if (person.getRole() == Role.supervisor && supervisors.size() < 3)
            this.supervisors.add(person);
    }
    
    public void addStudent(Person person) {
        if (person.getRole() == Role.student && students.size() < 2)
            this.students.add(person);
    }

}
