public class Main {

    public static void main(String[] args) {
        Thesis a = new Thesis();

        Person b = new Person("Laurent", "N", 25, Role.student);

        a.addSupervisor(b);
        System.out.println(a.getSupervisors().size());


    }

}
