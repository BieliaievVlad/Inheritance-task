package app;

public class Calculation {

    Randomizer randomizer = new Randomizer();

    public double calcPrize(int random, double bet) {
        if (random < 3) {
            return bet + bet * 25 / 100;
        } else if (random >= 3 & random <= 7) {
            return bet + bet * 25 / 100;
        }
        else return bet + bet;
    }
}
