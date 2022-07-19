package MyPackage;

public class SecondTask {
    String word;
    String number;

    public SecondTask(String word, String number) {
        System.out.println(word.matches("[A-Z]*"));
        System.out.println(number.matches("^\\+(380[5-9][0-9]\\d{7})$"));
    }
}


