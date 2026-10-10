import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TitlePrint();
        getUserNumberAndMultiply();
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
}