// stores person information
public class Person {
    // person attributes
    private String name;
    private int age;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // displays person information
    public void displayInfo() {
        System.out.println("Person Information");
        System.out.println("------------------");
        System.out.println("Name:  " + name);
        System.out.println("Age:   " + age);
        System.out.println("Email: " + email);
        System.out.println();
    }
}