package 암호;

import java.util.Scanner;

public class Main {
    public String solution(String str, int n) {
        String[] answer = new String[n];

        String tmp = "";
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = cnt; j < str.length(); j++) {
                if (str.charAt(j) == '#') {
                    tmp += "1";
                } else if (str.charAt(j) == '*') {
                    tmp += "0";
                }

                if (tmp.length() == str.length() / n) {
                    answer[i] = tmp;
                    tmp = "";
                    break;
                }
            }
            cnt += (str.length() / n);
        }
        for (int i = 0; i < n; i++) {
            answer[i] = String.valueOf(Integer.parseInt(answer[i], 2));
            answer[i] = String.valueOf((char) Integer.parseInt(answer[i]));
        }
        return String.join("", answer);
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.print(m.solution(str, n));
    }
}