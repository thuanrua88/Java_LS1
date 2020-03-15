package lab01;

public class CircleComputation {
    public static void main(String[] args) {
        double radius, area, circlecumference;
        final double PI = 3.14159265;
        radius = 1.2;
        area = radius * radius * PI;
        circlecumference = 2.0 * radius * PI;

        System.out.printf("The radius is ");
        System.out.println(radius);
        System.out.printf("The area is ");
        System.out.println(area);
        System.out.printf("The circlecumference is ");
        System.out.println(circlecumference);
    }
}
