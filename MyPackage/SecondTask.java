package MyPackage;

public class SecondTask {
    public static String regex = "HOMEWORK";
    public static void main(String[] args){
        System.out.println(regex.matches("^\\+?3?8?(0[5-9][0-9]\\d{7})$"));
        System.out.println(regex.matches("[A-Z]*"));
    }

}
