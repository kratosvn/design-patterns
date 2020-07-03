package decorator;

public class PepperDecorator extends PizzaDecorator{
    public PepperDecorator(PizzaInterface pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        String pzType = this.pizza.doPizza();
        return pzType + this.addPepper();
    }

    private String addPepper(){
        return " + Pepper";
    }
}
