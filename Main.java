public class Main {

    public static void main(String[] args) {
        // Декларираме и инициализираме обект от тип Cat
        Cat cat = new Cat();
        cat.meow();
    }

    static class Cat {
        // Методът има връщан тип void
        void meow() {
            System.out.println("Meow");
        }
    }
}
