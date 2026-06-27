import java.util.Scanner;

class Volume {

    // Private data members (Encapsulation)
    private double side;
    private double radius;
    private double height;

    // Setter methods
    public void setSide(double side) {
        this.side = side;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getter methods to calculate volume
    public double getCubeVolume() {
        return side * side * side;
    }

    public double getCylinderVolume() {
        return 3.14 * radius * radius * height;
    }

    public double getSphereVolume() {
        return (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }
}

public class Volume1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Volume obj = new Volume();

        // Cube
        System.out.print("Enter the side of the cube: ");
        double side = sc.nextDouble();
        obj.setSide(side);

        // Cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        obj.setRadius(radius);

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        obj.setHeight(height);

        // Display volumes
        System.out.println("\nVolume of Cube = " + obj.getCubeVolume());
        System.out.println("Volume of Cylinder = " + obj.getCylinderVolume());

        // Sphere
        System.out.println("Volume of Sphere = " + obj.getSphereVolume());

        sc.close();
    }
}