public class Triangle extends GeometricFigure{
    double sideA = 3;
    double sideB = 4;
    double sideC = 5;
    double s = (sideA + sideB + sideC) / 2;

    @Override
    void perimeter() {
        System.out.println (sideA + sideB + sideC);
    }

    @Override
    void area() {
        System.out.println(Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)));
    }

    public static void main(String[] args) {
        GeometricFigure triangle = new Triangle();
        triangle.perimeter();
        triangle.area();
    }
}
