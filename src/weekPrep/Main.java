package weekPrep;

// Address.java
class Address implements Cloneable {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone(); // Shallow copy is fine for immutable fields like String
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should never happen because we implement Cloneable
        }
    }

    @Override
    public String toString() {
        return "Address{city='" + city + "'}";
    }
}

// Person.java
class Person implements Cloneable {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public Person clone() {
        try {
            Person cloned = (Person) super.clone(); // Create a shallow copy
            // Now, clone the mutable field (address) to achieve deep cloning
            cloned.address = address.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should never happen because we implement Cloneable
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", address=" + address + "}";
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create an original Person with an Address
        Address address = new Address("New York");
        Person original = new Person("Alice", 30, address);

        // Perform deep cloning
        Person clone = original.clone();

        // Display both objects before making any changes
        System.out.println("Before change:");
        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);

        // Modify the address of the original Person
        original.getAddress().setCity("Los Angeles");

        // Display both objects after modifying the original's address
        System.out.println("\nAfter change:");
        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}
