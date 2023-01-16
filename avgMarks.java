import java.util.Scanner;

// program to Calculate Sum of 5 Subjects and Find Percentage (Max Mark in each subject is 100).
public class avgMarks {
    public static void main(String[] args) {
        System.out.println("Enter the marks of 5 subject <> ");
        Scanner sc = new Scanner(System.in);
        System.out.println("MATHS <> ");
        int mark1 = sc.nextInt();
        System.out.println("OOPS  <> ");
        int mark2 = sc.nextInt();
        System.out.println("DSA   <> ");
        int mark3 = sc.nextInt();
        System.out.println("BE    <> ");
        int mark4 = sc.nextInt();
        System.out.println("CAAL  <> ");
        int mark5 = sc.nextInt();

        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        System.out.println("Total marks obtained <> " + total + "/500");
        int Percentage = (total *100) / 500;
        System.out.println("Total Percatnge <> " + Percentage+"%");
    }
}
