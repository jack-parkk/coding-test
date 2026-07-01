package grammar;

import java.util.Arrays;

public class 중복조합 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int r = 2;

        int[] output = new int[r];

        repeatedCombination(arr, output, 0, 0, r);
    }

    static void repeatedCombination(int[] arr, int[] output, int depth, int start, int r) {
        if (depth == r) {
            System.out.println(Arrays.toString(output));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            output[depth] = arr[i];

            repeatedCombination(arr, output, depth + 1, i, r);
        }
    }
}
