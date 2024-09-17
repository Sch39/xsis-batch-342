package LogicPhase.Exercises.Day01;

public class Diff21 {
    public static int diff21(int n) {
        return n < 21 ? 21 - n : (n - 21) * 2;
    }

    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
    }
}
