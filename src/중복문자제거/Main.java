package 중복문자제거;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }
}
