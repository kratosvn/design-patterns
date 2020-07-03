package addapter;

public class TurkeyAdapter implements Duck{
    Turkey tk;

    public TurkeyAdapter(Turkey tk) {
        this.tk = tk;
    }

    @Override
    public void quack() {
        tk.gobble();
    }

    @Override
    public void fly() {
        tk.fly();
    }
}
