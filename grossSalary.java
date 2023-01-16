import java.util.Scanner;
// Write a program to find gross salary.
public class grossSalary {
    public static void main(String[] args) {
        int basic, da, ta, gross_salary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic pay <> ");
        basic = sc.nextInt();
        da = (10 * basic) / 100;
        ta = (12 * basic) / 100;
        gross_salary = basic + da + ta;
        System.out.println("The gross salary is " + gross_salary);
    }
}
