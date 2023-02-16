import java.lang.Math;
public class QuadraticRoots {
    public static void main(String[] args) {
        double a = -3;
        double b = -7;
        double c = 5;
        double root1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2 * a);
        double root2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2 * a);

        System.out.println("Coefficient A is " + a + ".");
        System.out.println("Coefficient B is " + b + ".");
        System.out.println("Coefficient C is " + c + ".");

        System.out.println("Root #1 is " + root1 + ".");
        System.out.println("Root #2 is " + root2 + ".");
    }
}
