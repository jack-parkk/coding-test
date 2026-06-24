package grammar;

public class 모든조합_곱의_합 {
    public static void main(String[] args) {
        
        // 모든 조합의 곱의 합
        // ex) {3,5,2,7} 의 모든조합의 곱은
        // (1+3)(1+5)(1+2)(1+7)-1 과 같다

        int[] nums = {3, 5, 2, 7};
        int answer =1;
        for (int num : nums) {
            answer *= (1 + num);
        }
        answer -=1;

        System.out.println("answer = " + answer);
    }
}
