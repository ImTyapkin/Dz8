import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое целое положительное число n");
        int n = scanner.nextInt();
        int sum = 0;

        for ( int a = 1; a <= n; a += 2) {
            sum = sum + a;
        }
                System.out.println(sum);
        }
    }
