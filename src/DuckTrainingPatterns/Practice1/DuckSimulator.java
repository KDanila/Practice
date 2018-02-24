package DuckTrainingPatterns.Practice1;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator ds = new DuckSimulator();
        AbstractDuckFactory factory = new CountingDuckFactory();
        ds.simulate(factory);
    }

    void simulate(AbstractDuckFactory factory){

        Quackable mallarDuck = factory.createMallarDuck();
        Quackable redHatDuck = factory.createRedHatDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("\nDuck simulator: \n");

        simulate(mallarDuck);
        simulate(redHatDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);

        System.out.println("\n"+QuackCounter.getQuackCounter());

    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
