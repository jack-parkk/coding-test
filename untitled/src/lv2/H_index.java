package lv2;

import java.util.*;
public class H_index {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
//        int[] citations = {1, 1, 5, 3, 3, 7};
//        int[] citations = {10};          // 답 1, 10 아님
//        int[] citations = {100,100,100}; // 답 3, 100 아님
//        int[] citations = {5,5,5,5};     // 답 4, 5 아님
        //n개의 논문 중 h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하로 인용되었다면 h의 최대값이 H-Index다
        int answer = 0;
        int h = 0;
        int n = citations.length; //논문 수
        // 오름차순 정렬
        Arrays.sort(citations); // 0 1 3 5 6
        while (h<=n) {
            int cnt = 0;
            for (int i : citations) {
                if (i >= h) {
                    cnt++; //인용된 논문 카운트
                 }
            }
            // n개의 논문 중 h 번 이상 인용된 논문이 h편 이상인가?
            // 나머지 논문이 h번 이하로 인용되었는가?
            if (cnt >= h && n - cnt <= h) {
                answer = h;
            } else { // 논문이 h편 이상이고 나머지 논문이 h번이하로 인용이 안되었다면 루프 종료
                break;
            }
            h++;
        }
        // answer를 반환
        System.out.println("answer = " + answer);


    }
}
