import java.lang.Math;
public class Cylinder {
    public static void main(String[] args) {
        double radius = 7.0;
        double height = 21.0;
        double surface_area = ((2 * Math.PI * Math.pow(radius,2)) + (2 * Math.PI * radius * height));
        System.out.println("Radius is " + radius + " centimeters.");
        System.out.println("Radius is " + height + " centimeters.");
        System.out.println("The cylinder's surface area is " + surface_area + " square centimeters.");
    }
}
