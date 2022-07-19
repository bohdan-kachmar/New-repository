package MyPackage;

public class SecondTask {
    public static Boolean validate(String text) {
        return text.matches("[A-Z]*");
    }
    public static Boolean checkIt(String number) {
        return number.matches("^\\+?380\\d{9}$");
    }
}


