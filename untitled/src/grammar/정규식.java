package grammar;

public class 정규식 {
    public static void main(String[] args) {
        // boolean 값 :문자열.matches("[0-9]+");
        // 해석 : 숫자로만 이루어져 있는지
        boolean val = "1234".matches("[0-9]+");
        boolean val2 = "12asdf34".matches("[0-9]+");
        System.out.println("val = " + val); //true
        System.out.println("val2 = " + val2); // false

        // boolean 값 : 문자열.matches("[a-zA-Z]+");
        // 해석 : 문자로만 이루어져 있는지
        boolean val3 = "asvd".matches("[a-zA-Z]+");
        boolean val4 = "12asdf34".matches("[a-zA-Z]+");
        System.out.println("val3 = " + val3); //true
        System.out.println("val4 = " + val4); // false
        
        // String 값 : 문자열.replaceAll("정규식","치환할 값");
        // 해석 : 정규식으로 문자열을 치환할 값으로 변경
        
        // 숫자제거 replaceAll("[0-9]","")
        System.out.println("\"test1234\".replaceAll(\"[0-9]\",\"\") => " + "test1234".replaceAll("[0-9]",""));
        // 숫자만 남기기 replaceAll("[^0-9]","")
        System.out.println("\"test1234\".replaceAll(\"[^0-9]\",\"\") = " + "test1234".replaceAll("[^0-9]",""));
        // 영어 제거 replaceAll("[a-zA-Z]","")
        System.out.println("\"test1234\".replaceAll(\"[^a-zA-Z]\",\"\") = " + "test1234".replaceAll("[a-zA-Z]",""));
        // 영어만 남기기 replaceAll("[^a-zA-Z]","")
        System.out.println("\"test1234\".replaceAll(\"[^a-zA-Z]\",\"\") = " + "test1234".replaceAll("[^a-zA-Z]",""));
        // 공백 제거 replaceAll("\\s","")
        System.out.println("\"t e s t 1234\".replaceAll(\"\\\\s\",\"\") = " + "t e s t 1234".replaceAll("\\s",""));
        // 공백 여러개를 하나로 replaceAll("\\s+"," ");
        System.out.println("\"test    1234\".replaceAll(\"\\\\s+\",\" \") = " + "test    1234".replaceAll("\\s+"," "));
        // 공백 여러개 처리 split.("\\s+")
        String[] arrs = "test   123    234".split("\\s+");
        for(String s : arrs) {
            System.out.println(s);
        }

        String new_id = "...!@BaT#*..y.abcdefghijklm";
        String answer = "";
        //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        answer = new_id.toLowerCase();
        //2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        answer = answer.replaceAll("[^a-z0-9-_.]","");
        System.out.println("answer = " + answer);

    }
}
