package MyPackage;

public class Main {
    public static void main(String[] args) {
        System.out.println("10. Datatypes in java");
        byte byteNumber = 127;
        short shortNumber = 32_767;
        int intNumber = 1_000_000_000;
        long longNumber = 999_999_999_999_999_999l;
        double doubleNumber = 213.992342442352;
        float floatNumber = 774.99f;
        boolean booleanType = true;
        char charType = 'a';
        System.out.println(byteNumber + "; " + shortNumber + "; " +intNumber + "; " + longNumber
                + "; " + doubleNumber + "; " + floatNumber + "; " + booleanType + "; " + charType);

        System.out.println("11 - 14. Conditional execution");
        if (byteNumber > 100){
            System.out.println("byteNumber is more than 100");
        }
        else if (byteNumber < 100){
            System.out.println("byteNumber is less than 100");
        }
        else {
            System.out.println("Is equals to " + byteNumber);
        }

        if (floatNumber == 774.99f){
            System.out.println("This is average salary in Ukraine");
        }
        else if (floatNumber >= 219.99 && floatNumber < 774.99){
            System.out.println("This is low salary in Ukraine");
        }
        else if (floatNumber >774.99 && floatNumber < 2000){
            System.out.println("This is the decent salary in Ukraine");
        }
        else if (floatNumber >=2000 && floatNumber <= 6000){
            System.out.println("This is a big salary in Ukraine");
        }
        else if (floatNumber >6000) {
            System.out.println("You should start your own company");
        }
        else {
            System.out.println("Go to study");
        }

        switch (charType){
            case 'A':
                System.out.println("Good job");
                break;
            case 'B':
                System.out.println("Not bad");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Can better");
                break;
            case 'F':
                System.out.println("Very bad");
                break;
            default:
                System.out.println("Not in the range");
            break;
        }

        System.out.println("15. Arrays");
        int[] numberArray = new int[] {100,-6,89,44,20,1,15,0};
        String[] stringArray = new String[] {"Facebook", "Twitter", "Instagram", "Snapchat"};
        System.out.println("The first number in the array is " + numberArray[0]);
        System.out.println("The first word in the array is " + stringArray[0]);

        System.out.println("16-19. Looping");
        for(int i = 1; i <= 5; i++){
            System.out.println("Easy loop "+ i);
        }
        int i =5;
        while (i >= 0){
            System.out.println("Number is "+ i);
            i--;
        }
        for(int a = 0; a < numberArray.length; a++){
            System.out.println("Loop with numberArray " + numberArray[a]);
        }

        System.out.println("20. String Interpolation");
        String myName = "Bohdan";
        String mySurname = "Kachmar";
        int age = 26;
        System.out.println(String.format("User info: name : %s, surname : %s, age : %d", myName, mySurname, age));
        System.out.println(String.format("Use arrays and interpolation: %s, %s, %s, This is byte number from the top: %d", stringArray[0], stringArray[1], stringArray[2], byteNumber));
    }
}
