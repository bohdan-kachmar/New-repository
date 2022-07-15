package MyPackage;

public class FirstTask {
    public static void main (String[] args){
        double number1 = 5;
        double number2 = 7;
        double result = areaOfaCircle(number1);
        double result1 = Circumference(number2);
        System.out.println("Area of a circle is: "+ result);
        System.out.println("Circumference is: "+ result1);

    }
    public static double areaOfaCircle (double num1){
        double result =(num1*num1)*Math.PI;
        return result;
    }
    public static double Circumference (double num1){
        double result =2*num1*Math.PI;
        return result;
    }
}
