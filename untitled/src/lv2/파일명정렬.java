package lv2;
import java.util.*;

public class 파일명정렬 {

    class Solution {

        class FileInfo {
            String original;
            String head;
            int number;

            public FileInfo(String original, String head, int number) {
                this.original = original;
                this.head = head;
                this.number = number;
            }
        }

        public String[] solution(String[] files) {

            List<FileInfo> list = new ArrayList<>();

            for (String file : files) {

                int start = 0;
                int end = 0;

                // 숫자 시작 위치 찾기
                for (int i = 0; i < file.length(); i++) {
                    if (Character.isDigit(file.charAt(i))) {
                        start = i;
                        break;
                    }
                }

                // 숫자 끝 위치 찾기 (최대 5자리)
                end = start;

                while (end < file.length()
                        && Character.isDigit(file.charAt(end))
                        && end - start < 5) {
                    end++;
                }

                String head = file.substring(0, start);
                String number = file.substring(start, end);

                list.add(new FileInfo(
                        file,
                        head,
                        Integer.parseInt(number)
                ));
            }

            list.sort((a, b) -> {

                // HEAD 비교 (대소문자 무시)
                int headCompare =
                        a.head.compareToIgnoreCase(b.head);

                if (headCompare != 0) {
                    return headCompare;
                }

                // NUMBER 비교
                return Integer.compare(a.number, b.number);
            });

            String[] answer = new String[files.length];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i).original;
            }

            return answer;
        }
    }
}
