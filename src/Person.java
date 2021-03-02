public class Person {

    private String name;
    private String surname;
    private int age;
    private Role role;

   public Person(String name, String surname, int age, Role role) {
       this.name = name;
       this.surname = surname;
       this.age = age;
       this.role = role;
   }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Role getRole() {
        return role;
    }

}
