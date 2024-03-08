import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a + b;
        int refrigerante = 0;

        while (total >= c) {
            total = total-c;
            total++;
            refrigerante++;
        }

        System.out.println(refrigerante);
        sc.close();
    }
}
