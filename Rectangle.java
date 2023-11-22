public class Rectangle extends GeometricFigure{
    double sideA = 4;
    double sideB = 6;

    @Override
    void perimeter() {
        System.out.println(2 * (sideA + sideB));
    }

    @Override
    void area() {
        System.out.println(sideA * sideB);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.perimeter();
        rectangle.area();
    }
}
