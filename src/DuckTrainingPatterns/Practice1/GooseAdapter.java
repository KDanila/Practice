package DuckTrainingPatterns.Practice1;

public class GooseAdapter implements Quackable {

    Goose goose;

    GooseAdapter(Goose goose) {
        this.goose = goose;
    }


    @Override
    public void quack() {
        goose.hunk();
    }
}
