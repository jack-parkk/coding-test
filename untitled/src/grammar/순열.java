package grammar;

import java.util.Arrays;

public class 순열 {
    public static void main(String[] args) {
        /**
         * arr = {1,2,3} 중에서 3개를 순서있게  전부 나열
         * [1, 2, 3]
         * [1, 3, 2]
         * [2, 1, 3]
         * [2, 3, 1]
         * [3, 1, 2]
         * [3, 2, 1]
         * nPr = n! / (n-r)!
         * 3P3 = 3! = 6
         * 3P2 = 3!/1! = 6
         * */

        /***
         * 고른다
         * 다음 자리로 간다
         * 되돌린다
         */

        int[] arr = {1, 2, 3}; // 뽑을 대상
        int r = 2;// 뽑을 갯수
        boolean[] visited = new boolean[arr.length];
        int[] output = new int[r]; // 뽑을 대상의 갯수에 따라 달라지는 배열 길이
        permutation(arr, visited, output, 0, r);
    }

    static void permutation(int[] arr, boolean[] visited, int[] output, int depth, int r) { // depth : output 몇번째 칸인지 알리는 index
        // r개를 다 뽑았으면 출력하고 종료
        if (depth == r) {
            System.out.println(Arrays.toString(output));
            return;
        }
        // 현재 depth 자리에 넣을 숫자를 arr에서 하나씩 골라본다
        for (int i = 0; i < arr.length; i++) {
            // 이미 사용한 숫자라면 건너뛴다
            if (visited[i]) {
                continue;
            }
            // arr[i]를 사용했다고 표시
            visited[i] = true;
            // 현재 depth 위치에 arr[i]를 넣는다
            output[depth] = arr[i];
            // 다음 위치를 채우러 간다
            permutation(arr, visited, output, depth + 1, r);

            // 다시 돌아왔으면 arr[i] 사용을 취소한다
            // 그래야 다른 경우의 수에서 arr[i]를 다시 쓸 수 있다
            visited[i] = false;
        }
    }
}
