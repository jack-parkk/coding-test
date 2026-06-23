package grammar;
import java.util.*;
public class 해쉬맵_해쉬셋 {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();

        hashMap.put("tes",12);
        System.out.println(hashMap.get("tes"));
        String[] arr = {"apple", "banana", "apple"};
        for (String s : arr) {
            hashMap.put(s,hashMap.getOrDefault(s,0)+1);
            System.out.println(s +" : " + hashMap.get(s));
        }

        // 포함되어있는지 확인 containsKey, containsValue
        if(hashMap.containsKey("apple")) {
            System.out.println("apple 있어");
        }

        // 값 줄이기
        hashMap.put("apple",hashMap.get("apple")-2);
        if(hashMap.get("apple") == 0 ) {
            hashMap.remove("apple");
        }
        // 전체 순회
    }
}
