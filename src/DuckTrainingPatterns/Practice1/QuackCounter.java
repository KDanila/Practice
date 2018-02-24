package DuckTrainingPatterns.Practice1;

public class QuackCounter implements Quackable {

    private static int quackCounter = 0;
    private Quackable quackable;

    QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        this.quackable.quack();
        quackCounter++;
    }

     static int getQuackCounter() {
        return quackCounter;
    }
}
