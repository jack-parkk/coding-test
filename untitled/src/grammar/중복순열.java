package grammar;

import java.util.Arrays;

public class 중복순열 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int r = 2;

        int[] output = new int[r];

        repeatedPermutation(arr, output, 0, r);
    }

    static void repeatedPermutation(int[] arr, int[] output, int depth, int r) {
        if (depth == r) {
            System.out.println(Arrays.toString(output));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            output[depth] = arr[i];

            repeatedPermutation(arr, output, depth + 1, r);
        }
    }
}
