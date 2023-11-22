public class Cat extends Animal{

    @Override
    void sound() {
        System.out.println("meow meow");
    }

    @Override
    void getName() {
        System.out.println("Kitty");
    }

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.getName();
        cat.sound();
    }
}
