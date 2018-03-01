package Factory.Practice1;

public abstract class PizzaFactory {
    void prepare(){
        System.out.println("Prepare");
    }
    abstract void makePizza();
}
