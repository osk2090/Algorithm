package 숫자만추출;

import java.util.Scanner;

public class Main {
    public int solution(String s) {
        s = s.toUpperCase().replaceAll("[A-Z]", "");
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(m.solution(str));
    }
}
