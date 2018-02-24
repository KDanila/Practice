package DuckTrainingPatterns.Practice1;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    Quackable createMallarDuck() {
        return new MallarDuck();
    }

    @Override
    Quackable createRedHatDuck() {
        return new RedHatDuck();
    }

    @Override
    Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
