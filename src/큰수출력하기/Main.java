package 큰수출력하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public String[] solution(int n, String str) {
        String[] answer = str.split(" ");
        System.out.println(Arrays.toString(answer));

        int[] a = new int[answer.length];

        for (int i = 0; i <= answer.length; i++) {
            a[i] = Integer.parseInt(answer[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= n) {
                a[i] = a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        return answer;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(m.solution(n,str));
    }
}
