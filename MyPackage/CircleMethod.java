package MyPackage;

public class CircleMethod {
    public static final double Pi = 3.14;

    public static void areaOfaCircle(double radius){
        if (radius < 0){
            System.out.println("Radius should be => 0");
            throw new IllegalArgumentException("Bad arguments");
        }
        System.out.println("The area of a circle is: " + radius*radius*Pi);
    }
    public static void circumference(double radius){
        if (radius < 0){
            System.out.println("Radius should be => 0");
            throw new IllegalArgumentException("Bad arguments");
        }
        System.out.println("The circumference is: " + 2*radius*Pi);
    }
}