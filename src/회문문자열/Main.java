package 회문문자열;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            return answer;
        }
        return "NO";
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }
}
