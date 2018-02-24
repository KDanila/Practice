package DuckTrainingPatterns.Practice1;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    Quackable createMallarDuck() {
        return new QuackCounter(new MallarDuck());
    }

    @Override
    Quackable createRedHatDuck() {
        return new QuackCounter(new RedHatDuck());
    }

    @Override
    Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
