class Main {

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();
    }

    static class Dog {
        static void bark() {
            System.out.println("Bark");
        }
    }
}
