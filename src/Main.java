public class Main {

    public static void main(String[] args) {
        Thesis a = new Thesis();
        Person p1 = new Person("", "", 2, Role.student);
        a.addStudent(p1);

        System.out.println(a.getStudents().contains(p1));
    }

}
