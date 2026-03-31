import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = scanner.nextInt();           

        System.out.print("Enter number: ");
        int num2 = scanner.nextInt();               

        int addedNum = num1 + num2;

        System.out.println("Your Number is: " + addedNum);

        scanner.close();
    }
}