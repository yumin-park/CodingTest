import java.util.Scanner;

public class java1110 {
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);

        int N = cal.nextInt();

        int cnt = 0;
        int copy = N;

        while (true) {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cnt++;
            if (copy == N) {
                break;
            }
        }
        System.out.println(cnt);
    }
}