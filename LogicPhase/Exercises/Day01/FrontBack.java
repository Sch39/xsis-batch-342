package logicphase.exercises.day01;

public class FrontBack {
    private static String frontBack(String str) {
        if (str.length() < 2) {
            return str;
        }
        String middleStr = new StringBuilder(str).deleteCharAt(0).deleteCharAt(str.length() - 2).toString();
        return str.charAt(str.length() - 1)
                + (str.length() == 2 ? "" : middleStr)
                + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }
}
