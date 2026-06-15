package lv2;
import java.util.*;

public class 오픈채팅방 {

    class Solution {
        public String[] solution(String[] record) {
            Map<String, String> nickMap = new HashMap<>();
            List<String> result = new ArrayList<>();

            for(String str : record) {
                String[] arrs = str.split(" ");
                if(arrs[0].equals("Enter") || arrs[0].equals("Change")) nickMap.put(arrs[1],arrs[2]);
            }
            for(String str : record) {
                String[] arrs = str.split(" ");
                StringBuilder sb =new StringBuilder();
                if(arrs[0].equals("Enter")) {
                    sb.append(nickMap.get(arrs[1]));
                    sb.append("님이 들어왔습니다.");
                    result.add(sb.toString());
                }
                if(arrs[0].equals("Leave")) {
                    sb.append(nickMap.get(arrs[1]));
                    sb.append("님이 나갔습니다.");
                    result.add(sb.toString());
                }
            }
            String[] answer = new String[result.size()];
            int idx = 0;
            for(String x : result) {
                answer[idx] = x;
                idx++;
            }
            return answer;
        }
    }
}
