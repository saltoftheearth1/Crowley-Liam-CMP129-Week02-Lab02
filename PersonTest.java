public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Maria Johnson", 28, "maria@example.com");
        Person person2 = new Person("David Smith", 35, "david@example.com");

        // tests setters
        person1.setName("Maria Davis");
        person1.setAge(29);
        person1.setEmail("maria.davis@example.com");

        // tests getters
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getEmail());

        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getEmail());

        person1.displayInfo();
        person2.displayInfo();
    }
}