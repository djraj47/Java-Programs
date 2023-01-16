import java.util.Scanner;

public class areaTriangle {
    public static void main(String[] args) {
        System.out.println("Area of Triangle");
        System.out.println("< 1 > for Equilateral triangle ");
        System.out.println("< 2 > for Ioscless triangle ");
        System.out.println("< 3 > for Scalen triangle ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        double area;
        switch (option) {
            case 1: {
                System.out.println("Enter side of Equilatral triangle <> ");
                int side = sc.nextInt();
                area = 0.433012 * side * side;
                System.out.println("The area is " + area);
            }
                break;
            case 2: {
                System.out.println("Enter the side of Ioscless triangle");
                int side = sc.nextInt();
                area = 
            }

            default:
                break;
        }
    }
}