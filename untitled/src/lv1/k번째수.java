package lv1;

import java.util.*;
public class k번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        List<Integer> list = new ArrayList<>();
        // commands 에서 가져온 값으로 i,j 까지 자르고
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2]-1;
            int[] temp = new int[j - i + 1];
            int tempIdx = 0;
            for (int idx = i-1; idx < j; idx++) {
                temp[tempIdx] = array[idx];
                tempIdx++;
            }
            // 배열이니 Arrays.sort로 오름차순 정렬하고
            Arrays.sort(temp);
            System.out.println(Arrays.toString(temp));

            // 정렬된 값의 k번째를 반환하면 된다.
            list.add(temp[k]);
            System.out.println("반환 값 = " + temp[k]);
        }
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size();i++) {
            answer[i] = list.get(i);
        }
       // return answer;
    }
}
