public class Trapezium extends GeometricFigure{
    double baseA = 5;
    double baseB = 7;
    double sideC = 5.5;
    double sideD = 6.5;
    double high = 4;

    @Override
    void perimeter() {
        System.out.println(baseA + baseB + sideC + sideD);
    }

    @Override
    void area() {
        System.out.println((baseA + baseB) / 2 * high);
    }

    public static void main(String[] args) {
        Trapezium trapezium = new Trapezium();
        trapezium.perimeter();
        trapezium.area();
    }
}
