package comparing_with_java;

public class Person_Java {
    public String firstName;
    public String lastName;
    public int age;

    // primary constructor
    public Person_Java (
            String firstName,
            String lastName,
            int age
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // zero-arg constructor
    public Person_Java () {
        this("", "", 0);
    }

    // one-arg constructor
    public Person_Java(String firstName) {
        this(firstName, "", 0);
    }

    // two-arg constructor
    public Person_Java(
            String firstName,
            String lastName
    ) {
        this(firstName, lastName, 0);
    }

    @Override
    public String toString() {
        return "Person_Java{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
