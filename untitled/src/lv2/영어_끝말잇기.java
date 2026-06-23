package lv2;
import java.util.*;

public class 영어_끝말잇기 {

    class Solution {
        public int[] solution(int n, String[] words) {
            Set<String> used = new HashSet<>();

            for(int i=0; i<words.length; i++) {
                String word = words[i];
                // 이전에 나왔던 단어가 없는지
                if (used.contains(word)) {
                    return new int[] {i%n+1, i/n+1};
                }
                // 끝말잇기가 되는지
                if(i != 0) {
                    String prev = words[i-1];
                    if(!prev.substring(prev.length()-1, prev.length())
                            .equals(word.substring(0,1))) {
                        return new int[] {i%n+1, i/n+1};
                    }
                }
                // 중복체크
                used.add(word);
            }
            return new int[]{0,0};
        }
    }
}
