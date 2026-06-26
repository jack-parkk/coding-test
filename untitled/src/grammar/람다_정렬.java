package grammar;
import java.util.*;
public class 람다_정렬 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        Collections.sort(list);// 오름차순 정렬
        System.out.println("오름차순 Collections.sort 정렬");
        for (int i : list) { // 정렬 후
            System.out.println("i = " + i);
        }
        System.out.println();
        // 람다식 기본 정의(매개변수) -> { 실행내용 }
        /** 1.
        * (a,b) -> {
         * return a-b;
         * }
         * = (a, b) -> a - b
        * a와 b를 받아와서 a-b를 return 한다.
        * */


        /** 2.
         * list.sort((a,b) -> Integer.compare(a,b));
         * a,b 는 list 안의 값들
         * 내부에서 여러번 비교되고
         * Comparator는 음수면 a가 앞
         * 0이면 순서 같음
         * 양수면 b가 앞
         * 즉 Integer.compare(a,b)는 오름차순
         * Integer.compare(b,a)는 내림차순
         * */
        System.out.println("오름차순 람다 Integer.compare(a,b) 정렬");
        List<Integer> list2 = Arrays.asList(3, 1, 2);
        list2.sort((a,b) -> Integer.compare(a,b));
        for (int i : list2) {
            System.out.println("i = " + i);
        }
        System.out.println();
        System.out.println("내림차순 람다 Integer.compare(b,a) 정렬");
        List<Integer> list3 = Arrays.asList(1, 2, 3);
        list3.sort((a, b) -> Integer.compare(b, a));
        for (int i : list3) {
            System.out.println("i = " + i);
        }
        System.out.println();


        /**
         * Map은 정렬기능이 없음 entrySet() 으로 List로 바꿔줘야 함.
         *
         * */
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 50);
        map.put(2, 10);
        map.put(3, 30);

        List<Map.Entry<Integer, Integer>> list4 = new ArrayList<>(map.entrySet());
        for (Map.Entry<Integer, Integer> entry : list4) {
            System.out.println("entry = " + entry);
            System.out.println("entryKey = " + entry.getKey());
            System.out.println("entryValue = " + entry.getValue());
        }
        System.out.println();

        // value 기준 정렬
        list4.sort((a, b) -> Integer.compare(a.getValue(), b.getValue())); // 오름차순
        System.out.println("value 기준 오름차순");
        for (Map.Entry<Integer, Integer> entry : list4) {
            System.out.println("entryKey = " + entry.getKey());
            System.out.println("entryValue = " + entry.getValue());
        }
        System.out.println();
        list4.sort((a, b) -> Integer.compare(b.getValue(),a.getValue())); // 내림차순
        System.out.println("value 기준 내림차순");
        for (Map.Entry<Integer, Integer> entry : list4) {
            System.out.println("entryKey = " + entry.getKey());
            System.out.println("entryValue = " + entry.getValue());
        }
        System.out.println();
        // key 기준 오름차, 내림차는 getKey() 진행...

        // int 배열 오름차순
        int[] arr = {3, 1, 2};
        Arrays.sort(arr); // 배열일경우 Arrays.sort(배열);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]

        // string 배열 오름차순
        String[] arrs = {"apple","watermelon", "banana"};
        Arrays.sort(arrs);
        System.out.println(Arrays.toString(arrs));
        
        // string 배열 길이순
        Arrays.sort(arrs, (a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println("Arrays.toString(arrs) = " + Arrays.toString(arrs));

        // String 길이순 + 사전순
        Arrays.sort(arrs, (a,b) -> {
            if (a.length() != b.length()) { // 길이순으로 정렬
                return Integer.compare(a.length(),b.length());
            }
            return a.compareTo(b);// 길이가 같다면 사전순으로 정렬
        });

        // 2차 배열 정렬 기준 예시
        int[][] arrarr = {
                {1, 5},
                {2, 3},
                {3, 4}
        };
        // 첫번째값을 기준으로 오름차순
        Arrays.sort(arrarr, (a, b) -> Integer.compare(a[0], b[0]));
        // 두번째값을 기준으로 오름차순
        Arrays.sort(arrarr, (a, b) -> Integer.compare(a[1], b[1]));

        // 첫번째 값을 기준으로 오름차순, 같다면 두번째 값으로 내림차순
        Arrays.sort(arrarr, (a,b) -> {
            if (!(a[0] != b[0])) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(b[1], a[1]);
        });

    }
}
