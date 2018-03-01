package Factory.Practice1;

public class SecondPizzaFactory extends PizzaFactory {
    @Override
    void makePizza() {
        System.out.println("Second pizza factory is making another PIZZA");
    }
}
