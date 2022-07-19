package MyPackage;

import com.sun.jdi.Method;

import static MyPackage.FirstTask.Circumference;
import static MyPackage.FirstTask.areaOfaCircle;

public class Main1 {
    public static void main(String[] args) {
        double number1 = 5;
        double number2 = 7;
        double result = areaOfaCircle(number1);
        double result1 = Circumference(number2);
        System.out.println("Task 1: ");
        System.out.println("Area of a circle is: " + result);
        System.out.println("Circumference is: " + result1);

        System.out.println();

        System.out.println("Task 2: ");
        SecondTask homework = new SecondTask("CHECK", "+380638658521");
    }
}
