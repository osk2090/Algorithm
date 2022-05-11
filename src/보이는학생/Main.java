package 보이는학생;

import java.util.Scanner;

public class Main {
    public int solution(int[] str) {
        int answer = 1;
        int max = str[0];

        for (int s : str) {
            if (s > max) {
                answer++;
                max = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] str = new int[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.nextInt();
        }

        System.out.println(m.solution(str));
    }
}
