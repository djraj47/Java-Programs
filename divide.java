import java.util.Scanner;

// program to Read Two Numbers and Print Their Quotient and Remainder.
public class divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the divident <> ");
        int n1 = sc.nextInt();
        System.out.println("Enter the divisor <> ");
        int n2 = sc.nextInt();
        int Quotient = n1 / n2;
        int Remainder = n1 % n2;
        System.out.println("Remainder <> " + Remainder);
        System.out.println("Quotient  <> " + Quotient);
    }
}
