import java.util.Scanner;
import java.util.Random;

public class DiceStats {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("How many dice will constitute one roll? ");
        int numOfDice = input.nextInt();
        System.out.println("How many rolls?");
        float numOfRolls = input.nextFloat();

        int[] frequency = new int[(numOfDice * 6)];
        float[] percentage = new float[(numOfDice * 6)];

        for (int roll = 1; roll <= numOfRolls; roll++) {
            ++frequency[rand.nextInt(numOfDice * 6)];
        }

        for (int i = 0; i < percentage.length; i++) {
            percentage[i] = (((float) frequency[i]) / numOfRolls) * 100;
        }
        System.out.printf("%n%-10s%-15s%-10s%n%n", "Sum", "# of times", "Percentage");

        for (int face = 0; face < frequency.length; face++) {
            System.out.printf("%-10d%-15d%.2f", face + 1, frequency[face], percentage[face]);
            System.out.println(" %");
        }
    }
}
