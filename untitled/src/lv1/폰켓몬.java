package lv1;
import java.util.*;

public class 폰켓몬 {
    class Solution {
        public int solution(int[] nums) {
            // 뽑을 수 있는 폰켄몬 수
            int choice = nums.length/2;

            //중복 확인 set
            Set<Integer> set = new HashSet<>();

            for(int n : nums) {
                set.add(n);
            }
            int answer = 0;

            if(set.size() > choice) {
                answer = choice;
            } else {
                answer = set.size();
            }
            return answer;
        }
    }
}
