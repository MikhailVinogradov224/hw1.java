/**
 * hw1
 */
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int k = (n* (n+1))/2;
            System.out.println(k);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}