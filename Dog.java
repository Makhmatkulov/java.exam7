public class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Wof wof");
    }

    @Override
    void getName() {
        System.out.println("Doggy");
    }
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.getName();
        dog.sound();
    }
}
