package MyPackage;

public class Reg {
    private String regex;
    public Reg (String constructorReg){
        regex = constructorReg;
    }
    public boolean check(String text){
        return text.matches(regex);
    }

}
