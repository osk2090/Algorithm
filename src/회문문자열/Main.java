package 회문문자열;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
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
