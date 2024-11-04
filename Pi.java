import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Compute to how many terms of the series? ");

        int termsAmount = input.nextInt();

        getTerms(termsAmount);

        return;
    }

    public static void getTerms(int termsAmount) {

        float previousTerm = 0;
        float denominator = 1;

        System.out.printf("%-8s %s\n", "term", "PI Approximation");
        for (int i = 1; i <= termsAmount; i++) {
            if (i % 2 == 0) {
                previousTerm = previousTerm - (4 / denominator);
            } else {
                previousTerm = previousTerm + (4 / denominator);
            }
            denominator += 2;
            System.out.printf("%-8d %f\n", i, previousTerm);
        }
        return;
    }
}