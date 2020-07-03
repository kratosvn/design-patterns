package decorator;

public class PizzaShop {
    public static void main(String[] args){
        PizzaInterface tomatoPz = new TomatoPizza();
        PizzaInterface chicken = new ChickenPizza();

        System.out.println(tomatoPz.doPizza());
        System.out.println(chicken.doPizza());

        PepperDecorator pDecorator = new PepperDecorator(tomatoPz);
        System.out.println(pDecorator.doPizza());

        CheeseDecorator cheeseDecorator = new CheeseDecorator(tomatoPz);
        System.out.println(cheeseDecorator.doPizza());

        CheeseDecorator cheeseDecorator2 = new CheeseDecorator(pDecorator);
        System.out.println(cheeseDecorator2.doPizza());
    }
}
