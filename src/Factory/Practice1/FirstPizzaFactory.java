package Factory.Practice1;

public class FirstPizzaFactory extends PizzaFactory {
    @Override
    void makePizza() {
        System.out.println("First pizza factory is making PIZZA!!");
    }
}
