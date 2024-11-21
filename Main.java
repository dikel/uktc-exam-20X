@@ -1,13 +1,13 @@
public class Main {
 class Main {

    public static void main(String[] args) {
        Dog dog;
        dog.bark();
    }

    static class Dog {
        bark() {
            println("Bark");
    static void bark() {
            System.out.print("Bark");
        }
    }
}
