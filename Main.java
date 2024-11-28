public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();  // Initialize the dog object
        dog.bark();  // Call the bark method
    }

    static class Dog {
        public void bark() {  // Add the return type (void) and access modifier (public)
            System.out.println("Bark");  // Correct way to print in Java
        }
    }
}
