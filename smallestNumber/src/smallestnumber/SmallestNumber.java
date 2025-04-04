package smallestnumber;

import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {
        //Read in two numbers from the keyboard.
        //Display the smallest number with an appropriate message.

        Scanner kbd = new Scanner(System.in);

        int num1, num2;
        System.out.println("Enter number 1: ");
        num1 = kbd.nextInt();

        System.out.println("Enter number 2: ");
        num2 = kbd.nextInt();

        if (num1 < num2) {
            System.out.print(num1 + " is the smallest number");
        } else {
            System.out.print(num2 + " is the smallest number");
        }
    }

}
