package app;

public class SubCalculation1 extends Calculation {

    @Override
    public double calcPrize(double bet) {
        return (bet + bet * 25 / 100) - (bet * 5 / 100);
    }
}
