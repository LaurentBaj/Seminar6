public class Thesis {

    // Members
    private Supervisor[] supervisors;
    private Student[] students;
    private Meeting[] meetings;

    // Ctor
    public Thesis() {
        this.supervisors = new Supervisor[3];
        this.students = new Student[2];
        this.meetings = new Meeting[10];
    }

    // Getters
    public Supervisor[] getSupervisors() {
        return supervisors;
    }

    public Student[] getStudents() {
        return students;
    }

    public Meeting[] getMeetings() {
        return meetings;
    }

    // Methods
    public void addSupervisor() {

    }


}
