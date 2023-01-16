import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

// program to Calculate Area of Rectangle, Square.
public class area {
    public static void main(String[] args) {
        System.out.println("press < 1 or 2 > to find AREA ");
        System.out.println("press < 1 > for SQUARE ");
        System.out.println("press < 2 > for RECTANGLE ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        double area;
        switch (option) {
            case 1: {
                System.out.print("Enter the Side of Square in cm <> ");
                int side = sc.nextInt();
                area = side * side;
                System.out.println("The area of Square is " + area + "cm\u00b2");
            }
                break;
            case 2: {
                System.out.print("Enter the Lenght of Rectangle <> ");
                int l = sc.nextInt();
                System.out.print("Enter the Breadth of Rectangle <> ");
                int b = sc.nextInt();
                area = l * b;
                System.out.println("The area of Rectangle is " + area + "cm\u00b2");
            }
                break;
            default:
                System.out.println("Invalid !!");
                break;
        }
    }
}
