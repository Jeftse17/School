import java.lang.Math;

public class Triangle {
    public static void main(String[] args) {
        double a = 5.0;
        double b = 6.0;
        double c = 7.0;
        double s;
        s = (a + b + c) / 2;
        double area;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The triangle is " + area + " square centimeters.");
    }
}
