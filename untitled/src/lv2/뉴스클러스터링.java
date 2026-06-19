package lv2;
import java.util.*;

public class 뉴스클러스터링 {
    public static void main(String[] args) {

        class Solution {
            public int solution(String str1, String str2) {
                List<String> list1 = new ArrayList();
                List<String> list2 = new ArrayList();
                int answer = 0;
                double top = 0;
                double bottom = 0;
                // 2자리 쪼개기, 영문자만 남기고 나머지 없애기
                for(int i = 0; i< str1.length()-1; i++) {
                    String s1 = str1.substring(i, i+2);

                    s1 = s1.replaceAll("[^a-zA-Z]","");
                    // 대소문자구분 x
                    if(s1.length() == 2) {
                        list1.add(s1.toUpperCase());
                        System.out.println("str1 -"+ i + " " + s1.toUpperCase());
                    }
                }
                System.out.println();
                for(int i = 0; i< str2.length()-1; i++) {
                    String s2 = str2.substring(i, i+2);

                    s2 = s2.replaceAll("[^a-zA-Z]","");
                    // 대소문자구분 x
                    if(s2.length() == 2) {
                        list2.add(s2.toUpperCase());
                        System.out.println("str2 -"+ i + " " + s2.toUpperCase());
                    }
                }

                if (list1.size() == 0 && list2.size() == 0) {
                    return 65536;
                }
                int saveList2Size = list2.size();

                if(!(list1.size() == 0 || list2.size() == 0)) {
                    for(String x : list1) {
                        for(int i = 0; i<list2.size();i++) {
                            if(x.equals(list2.get(i))) {
                                top++;
                                list2.remove(i);
                                break;
                            }
                        }
                    }
                    bottom =  list1.size() + saveList2Size - top;
                    answer = ( (int) ((top / bottom) * 65536) );
                }
                return answer;
            }
        }
    }
}