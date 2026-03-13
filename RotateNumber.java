import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;   // get last digit
        int remaining = num / 10;   // remove last digit

        int rotated = lastDigit * 1000 + remaining; // rotate number

        System.out.println("Rotated Number: " + rotated);
    }
}