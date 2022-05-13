package 소수;

import java.util.Scanner;

public class Main {
    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int i1 = i; i1 <= n; i1 = i1 + i) {
                    ch[i1] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(m.solution(n));
    }
}
