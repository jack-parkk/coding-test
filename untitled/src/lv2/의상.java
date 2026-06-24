package lv2;
import java.util.*;
public class 의상 {
    public static void main(String[] args) {
        class Solution {
            public int solution(String[][] clothes) {
                int answer = 1;

                Set<String> menu = new HashSet<>();
                Map<String, Integer> map = new HashMap<>();

                for (String[] x : clothes) {
                    String cloth = x[1];
                    System.out.println("cloth = " + cloth);
                    menu.add(cloth);
                    map.put(cloth,map.getOrDefault(cloth,0) + 1);
                    System.out.println("map.get(cloth) = " + map.get(cloth));
                }

                for (String s : menu) {
                    answer *= (1 + map.get(s));
                    System.out.println("s = " + s);
                }
                answer -=1;
                System.out.println(answer);
                return answer;
            }
        }
    }
}
