import java.util.Scanner;

public class task1a {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(Math.sqrt(a * a + b * b));
    }
}
