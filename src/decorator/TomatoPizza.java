package decorator;

public class TomatoPizza implements PizzaInterface{
    @Override
    public String doPizza() {
        return "Tomato Pizza";
    }
}
