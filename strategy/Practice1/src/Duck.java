public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    public Duck() {
    }
    public abstract void display();
    public void swim(){
        System.out.println("A duck is swimming !");
    }
    public void doQuack() {
        quackBehavior.quack();
    };
    public void doFly() {
        flyBehavior.fly();
    };
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

}
