package decorator;

import org.jetbrains.annotations.Contract;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(PizzaInterface pizza) {
        super(pizza);
    }

    @Override
    public String doPizza() {
        String pzType = this.pizza.doPizza();
        return pzType + this.addCheese();
    }

    @Contract(pure = true)
    private String addCheese(){
        return " + Cheese";
    }
}
