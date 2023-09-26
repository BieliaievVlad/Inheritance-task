package app;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    static double bet;
    static int random;

    public static void main(String[] args) {
        Randomizer randomizer = new Randomizer();
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        System.out.print("Your bet, UAH: ");
        bet = scan.nextDouble();
        random = randomizer.random(0, 10);

        if (random < 3) {
            Calculation calculation = new Calculation();
            System.out.printf("Your number is: %d%nYour winning, UAH: %.2f",
                    random, calculation.calcPrize(bet));
        } else if (random <= 7) {
            SubCalculation1 subCalculation = new SubCalculation1();
            System.out.printf("Your number is: %d%nYour winning, UAH: %.2f",
                    random, subCalculation.calcPrize(bet));
        } else {
            SubCalculation2 subCalculation2 = new SubCalculation2();
            System.out.printf("Your number is: %d%nYour winning, UAH: %.2f",
                    random, subCalculation2.calcPrize(bet));
        }


    }
}
