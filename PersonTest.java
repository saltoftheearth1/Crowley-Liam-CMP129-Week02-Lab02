public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Maria Johnson");
        person1.setAge(28);
        person1.setEmail("maria@example.com");

        person2.setName("David Smith");
        person2.setAge(35);
        person2.setEmail("david@example.com");

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