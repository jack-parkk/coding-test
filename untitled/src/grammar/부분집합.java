package grammar;
import java.util.*;

public class 부분집합 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();

        subset(arr, list, 0);
    }

    static void subset(int[] arr, ArrayList<Integer> list, int depth) {
        if (depth == arr.length) {
            System.out.println(list);
            return;
        }

        // 현재 원소를 안 고르는 경우
        subset(arr, list, depth + 1);

        // 현재 원소를 고르는 경우
        list.add(arr[depth]);
        subset(arr, list, depth + 1);

        // 다시 되돌리기
        list.remove(list.size() - 1);
    }
}
