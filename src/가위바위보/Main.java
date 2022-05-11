package 가위바위보;

import java.util.Scanner;

public class Main {
    public String[] solution(int n, int[] a, int[] b) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                if (b[i] == 2) {
                    answer[i] = "B";
                } else if (b[i] == 3) {
                    answer[i] = "A";
                } else {
                    answer[i] = "D";
                }
            } else if (a[i] == 2) {
                if (b[i] == 1) {
                    answer[i] = "A";
                } else if (b[i] == 3) {
                    answer[i] = "B";
                } else {
                    answer[i] = "D";
                }
            } else {
                if (b[i] == 1) {
                    answer[i] = "B";
                } else if (b[i] == 2) {
                    answer[i] = "A";
                } else {
                    answer[i] = "D";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        for (String s : m.solution(n, a, b)) {
            System.out.println(s);
        };

    }
}
