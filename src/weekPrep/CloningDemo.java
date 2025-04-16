package weekPrep;//package weekPrep;
//
//class Person implements Cloneable {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // Override clone() to make it public and support cloning
//    @Override
//    public Person1 clone() {
//        try {
//            // This creates a shallow copy of the Person object.
//            return (Person1) super.clone();
//        } catch (CloneNotSupportedException e) {
//            // This should never happen because we're Cloneable.
//            throw new AssertionError();
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Person{name='" + name + "', age=" + age + "}";
//    }
//}
//
//public class CloningDemo {
//    public static void main(String[] args) {
//        Person1 original = new Person1("Alice", 30);
//        Person1 copy = original.clone();
//
//        System.out.println("Original: " + original);
//        System.out.println("Clone: " + copy);
//    }
//}
