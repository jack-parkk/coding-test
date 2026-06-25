package lv2;
import java.util.*;
public class 롤케이크_자르기 {
    public static void main(String[] args) {
        int[] topping = {1, 2, 3, 1, 4};
        int answer = 0;
        // 가짓수 몇개인지 확인하기
        Set<Integer> cnt = new HashSet<>();
        for (int i : topping) {
            cnt.add(i);
        }
        int num = cnt.size(); // 토핑 가짓수
        System.out.println("토핑 수 : " + cnt);

        //만약 공평하게 나누지 못한다면 0 반환
        // 조건 1 : 가짓 수가 짝수가 아닐경우
        if (num % 2 == 1) {
            System.out.println(answer);
//          return answer;
        }
        // 조건 2 : 가짓 수의 갯수가 2 이상이 아닐경우


        // 배열을 for으로 돌면서 num/2가 되는 지점부터 num/2보다 커지는 지점까지 answer 갯수 카운트
        int save = 0;
        Set<Integer> count = new HashSet<>();
        for(int i =0; i<topping.length; i++ ) {
            count.add(topping[i]);
            save = count.size();
            if(save == (num/2)) answer++; // 공평하게 나눠진 다면 answer 가짓수 추가
            if (save > (num/2)) break; // 공평함을 벗어난다면 루프문 벗어남
        }

        System.out.println(answer);
    }
}
