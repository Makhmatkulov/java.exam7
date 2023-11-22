public class Duck extends Animal{

    @Override
    void sound() {
        System.out.println("Quack quack");
    }

    @Override
    void getName() {
        System.out.println("Mr.Duck");
    }
    public static void main(String[] args) {
        Animal duck = new Duck();
        duck.getName();
        duck.sound();
    }
}
