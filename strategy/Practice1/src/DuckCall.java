public abstract class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
    };

    public abstract void display();

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void callDuck() {
        quackBehavior.quack();
    };

}
