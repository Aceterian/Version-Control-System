import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TitlePrint();
        getUserNumberAndMultiply();
        getSize();
    }

    public static void TitlePrint() {
        System.out.println("********************");
        System.out.println("* Method Exercises *");
        System.out.println("********************");
    }

    public static void Multiplaer(int number) {
        int result = number * 1000;
        System.out.println("Result: " + result);
    }

    public static void getUserNumberAndMultiply() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        Multiplaer(number);
    }

    public static void getSize() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter width number: ");
        int a = scan.nextInt();

        System.out.print("Enter length number: ");
        int b = scan.nextInt();

        int c = (a * b);


        System.out.println("Width = " + a);
        System.out.println("Length = " + b);
        System.out.println("Area = " + c);
    }
}