package Factory.Practice1;

public class MainMethod {
    public static void main(String[] args) {
        PizzaFactory pz = new SecondPizzaFactory();
        pz.prepare();
        pz.makePizza();
    }
}
