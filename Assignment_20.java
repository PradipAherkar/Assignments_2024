
// Demonstrate object modification through shared references

class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

public class Assignment_20 {
            public static void main(String[] args) {
                Person person1 = new Person("John", 30, "Male");
                Person person2 = person1; // Shared reference
        
                System.out.println("Before modification:");
                person1.displayDetails();
        
                // Modifying through one reference
                person2 = new Person("Jane", 28, "Female");
        
                System.out.println("After modification:");
                person1.displayDetails();
                person2.displayDetails();        
    }
}
