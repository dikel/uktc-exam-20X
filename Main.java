public class Main {

    public static void main(String[] args) {
        Dog dog;
        dog.bark();
        People people;
        people.fight();
    }

    static class Dog {
        bark() {
            println("Bark");
        }
    }
    static class People {
        fight() {
            println("FIGHT");
        }
    }
}
