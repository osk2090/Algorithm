package 대소문자변환;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (x >= 97 && x <= 122) {
                answer += (char) (x - 32);
            } else {
                answer += (char) (x + 32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(m.solution(str));
    }
}
