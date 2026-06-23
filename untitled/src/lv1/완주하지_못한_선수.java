package lv1;
import java.util.*;

public class 완주하지_못한_선수 {

    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            // 참가자 동명이인 구분하는 값으로 HashMap으로 넣기
            Map<String, Integer> map = new HashMap<>();
            for(String par : participant) {
                map.put(par, map.getOrDefault(par,0)+1);
            }
            for(String com : completion) {
                if(map.containsKey(com)) {
                    map.put(com, map.get(com)-1);
                    if(map.get(com) == 0) {
                        map.remove(com);
                    }
                }
            }
            //
            answer = map.keySet().iterator().next();
            return answer;
        }
    }
}
