package MyPackage;


public class Runner {
    public static void main (String[] args){

        CircleMethod.areaOfaCircle(77);
        CircleMethod.circumference(88);

        Reg phoneReg = new Reg("^\\+?380\\d{9}$");
        Reg wordReg = new Reg("[A-Z]*");
        boolean resultOfPhoneCheck = phoneReg.check("+380638658521");
        boolean resultOfWordCheck = wordReg.check("HELLO");
        System.out.println("Results: \n\t1)" + resultOfPhoneCheck + "\n\t2)" + resultOfWordCheck);
    }

}