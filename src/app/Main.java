package app;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    static double bet;
    static int random;

    public static void main(String[] args) {
        Randomizer randomizer = new Randomizer();
        Calculation calculation = new Calculation();
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.ENGLISH);

        System.out.print("Your bet, UAH: ");
        bet = scan.nextDouble();
        random = randomizer.random(0, 10);

        System.out.printf("Your number is: %d%nYour winning, UAH: %.2f",
                random, calculation.calcPrize(random, bet));


    }
}
