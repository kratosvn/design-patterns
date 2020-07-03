package decorator;

public abstract class PizzaDecorator implements PizzaInterface{
    protected PizzaInterface pizza;
    @Override
    public String doPizza() {
        return null;
    }

    public PizzaDecorator(PizzaInterface pizza) {
        this.pizza = pizza;
    }

    public PizzaInterface getPizza() {
        return pizza;
    }

    public void setPizza(PizzaInterface pizza) {
        this.pizza = pizza;
    }
}
