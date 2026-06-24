package lv2;

import java.util.*;
public class 할인_행사 {
    public static void main(String[] args) {

        class Solution {
            public int solution(String[] want, int[] number, String[] discount) {
                int answer = 0;

                Map<String, Integer> map = new HashMap<>();

                // 원하는 상품과 개수 저장
                for (int i = 0; i < want.length; i++) {
                    map.put(want[i], number[i]);
                }

                // 시작일 i
                for (int i = 0; i <= discount.length - 10; i++) {
                    Map<String, Integer> dump = new HashMap<>(map);

                    // i일부터 10일간 검사
                    for (int j = i; j < i + 10; j++) {
                        String str = discount[j];

                        if (dump.containsKey(str)) {
                            dump.put(str, dump.get(str) - 1);

                            if (dump.get(str) == 0) {
                                dump.remove(str);
                            }
                        }
                    }

                    // 10일 검사 끝난 뒤 전부 만족했는지 확인
                    if (dump.isEmpty()) {
                        answer++;
                    }
                }

                return answer;
            }
        }

    }
}
