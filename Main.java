public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meow();
    }

    static class Cat {
        public void meow() {
            System.out.println("Meow");
        }
    }
}
