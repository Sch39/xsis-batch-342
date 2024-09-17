package Exercises.Day01;

public class NotString {
    private static String notString(String str) {
        String[] splitedStr = str.split("\\s+");

        return !splitedStr[0].equals("not") ? "not " + str : str;
    }

    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }
}
