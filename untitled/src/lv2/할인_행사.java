package lv2;

import java.util.*;
public class 할인_행사 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        int answer = 0;
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> dump = new HashMap<>();

        // hashMap에 key value를 넣고
        for (int i = 0; i < want.length - 1; i++) {
            map.put(want[i],number[i]);
        }
        dump = map;
        // discount에서 for each로 돌아서
        // 길이 10안에 전부 다 value를 없앨 수 있을 때 마다 해당 answer를 ++;
        int leng = 9;
        for(int i=0; i<discount.length-1; i++) {
            if (leng == 0) break;
            if (map.get(discount[i]) != null) {
                // 할인일일 경우 갯수 -1
                map.put(discount[i],map.get(discount[i])-1);
                // 할인품목 전부 구매시 remove
                if(map.get(discount[i]) == 0 ) {
                    System.out.println("날아갔니? : " + discount[i]);
                    map.remove(discount[i]);
                }
            }
            // 모두 만족한 10일이면 answer 더하기
            if(map.isEmpty() || map == null) answer++;
            leng--;
        }

        System.out.println("answer = " + answer);

    }
}
