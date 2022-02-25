package 문장속단어;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        String[] words = str.split(" ");

        for (String s : words) {
            if (answer.length() < s.length()) {
                answer = s;
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
