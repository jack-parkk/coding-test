package practice;

import java.util.Arrays;

public class 순열연습 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // 모수
        int r = 2; // 그중에서 뽑을 갯수
        boolean[] visited = new boolean[arr.length];
        int[] output = new int[r]; //실제 담겨질 값
        permutation(arr, visited, output, 0, r);
    }

    static void permutation(int[] arr, boolean[] visited, int[] output, int depth, int r) {
        //r 개 뽑았으면 출력하고 종료
        if (depth == r) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            output[depth] = arr[i];
            permutation(arr,visited,output,depth+1,r);
            visited[i] =false;
        }

    }
}
