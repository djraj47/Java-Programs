import java.util.Scanner;
// program to Find the Average of Three Numbers.
public class average {
    public static void main(String[] args) {
        System.out.println("Enter three Numbers <> ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int sum = (n1 + n2 + n3) / 3;
        System.out.println("The average of three numbers is " + sum);
    }
}
