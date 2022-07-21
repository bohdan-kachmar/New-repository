package MyPackage;

import com.sun.jdi.Method;

import static MyPackage.FirstTask.Circumference;
import static MyPackage.FirstTask.areaOfaCircle;
import static MyPackage.SecondTask.checkIt;
import static MyPackage.SecondTask.validate;

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
        String wording = "NEW";
        String phoneNumber = "+380638658522";
        boolean check = validate(wording);
        boolean check1 = checkIt(phoneNumber);
        System.out.println("Result is : "+ check);
        System.out.println("Result is : "+ check1);

    }
}
