package decorator;

public class ChickenPizza implements PizzaInterface{
    @Override
    public String doPizza() {
        return "Chicken Pizza";
    }
}
