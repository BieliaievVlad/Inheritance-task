package app;

public class Randomizer {

    public int random(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

}
