package test;

import java.util.Scanner;

public class palindrome {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), reversed = 0, original = num;

        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        if (original == reversed)
            System.out.println(original + " is a Palindrome");
        else
            System.out.println(original + " is not a Palindrome");
        sc.close();
    }
}
    

