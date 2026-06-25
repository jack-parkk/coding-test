package lv2;

import java.util.*;

public class 귤_고르기 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int k, int[] tangerine) {
                Map<Integer, Integer> map = new HashMap<>();

                // 갯수 카운트 하고
                for (int size : tangerine) {
                    map.put(size, map.getOrDefault(size, 0) + 1);
                }
                // 현재 가지고 있는 key 값 저장
                List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
                // 같은 크기가 많은 귤, 크기가 작은 귤 순으로 정렬
                list.sort((a,b) -> {
                    //1 순위 value 내림차순
                    if (!a.getValue().equals(b.getValue())) {
                        return Integer.compare(b.getValue(),a.getValue());
                    }
                    // 2순위 key 작은순
                    return Integer.compare(a.getKey(), b.getKey());
                });

                int count = 0; // 귤 카운트
                int answer = 0; // 가짓수 카운트

                for (Map.Entry<Integer, Integer> entry : list) {
                    count += entry.getValue();
                    answer++;
                    if (count >= k) {
                        break;
                    }
                }
                return answer;
            }
        }
    }
}
