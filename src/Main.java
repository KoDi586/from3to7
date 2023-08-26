import java.util.Arrays;

public class Main {

    public static int[] givefrom3to7(int[] ints) {
        int[] finishints = new int[5];
        for (int i = 2; i <= 6; i++) {
            if (ints[i] % 2 == 0) {
                finishints[i - 2] = ints[i] + 1;
            } else {
                finishints[i - 2] = ints[i];
            }
        }
        return finishints;
    }

    public static void main(String[] args) {
        int[] begin = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] finish = givefrom3to7(begin);
        System.out.println(Arrays.toString(finish));
    }
}