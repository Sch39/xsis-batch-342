package logicphase.exercises.day01;

public class Diff21 {
    public static int diff21(int n) {
        int absDiff = Math.abs(n - 21);
        return n < 21 ? absDiff : absDiff * 2;
    }

    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
    }
}
