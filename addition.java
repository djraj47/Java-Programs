import java.util.Scanner;
// program for the addition of Two Numbers
public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number <> ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number <> ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is " + sum);
    }
}
