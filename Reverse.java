import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long integerInput = 1;

        while (integerInput != 0) {
            System.out.println("Please enter a long integer (0 to quit): ");
            integerInput = input.nextLong();
            if (integerInput == 0) {
                System.out.println("Goodbye!");
                return;
            }
            long reversedNum = reverseDigits(integerInput);
            System.out.println("The number reversed is: " + reversedNum);
        }

        return;
    }

    public static long reverseDigits(long input) {
        long reversedNum = 0;

        while (input != 0) {
            reversedNum = reversedNum * 10 + input % 10;
            input = input / 10;
        }

        return reversedNum;
    }
}
