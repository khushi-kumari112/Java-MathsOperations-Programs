package test;
import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, result = 0, digits = 0;

        // Count digits
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        if (result == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is not an Armstrong number");
        sc.close();
    }
}


