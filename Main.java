public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.meow();
    }
//промени2
    static class Cat {
        void meow() {
            System.out.println("Meow");
        }
    }
}
