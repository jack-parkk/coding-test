package lv2;
import java.util.*;
public class 롤케이크_자르기 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] topping) {
                int answer = 0;

                Set<Integer> left = new HashSet<>();
                Map<Integer, Integer> right = new HashMap<>();

                // 처음에는 오른쪽에 전체 토핑이 다 있다고 생각
                for (int t : topping) {
                    right.put(t, right.getOrDefault(t, 0) + 1);
                }

                // 하나씩 오른쪽에서 왼쪽으로 옮긴다
                for (int i = 0; i < topping.length - 1; i++) {
                    int t = topping[i];

                    // 왼쪽에 추가
                    left.add(t);

                    // 오른쪽에서 하나 제거
                    right.put(t, right.get(t) - 1);

                    // 오른쪽에 해당 토핑이 더 이상 없으면 종류에서 제거
                    if (right.get(t) == 0) {
                        right.remove(t);
                    }

                    // 왼쪽 종류 수와 오른쪽 종류 수가 같으면 공평
                    if (left.size() == right.size()) {
                        answer++;
                    }
                }

                return answer;
            }
        }
    }
}
