package addapter;

public class DuctTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("mallardDuck say");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("wildTurkey say");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

        System.out.println("testDuct");
        testDuct(turkeyAdapter);
    }

    static void testDuct(Duck d){
        d.quack();
        d.fly();
    }
}
