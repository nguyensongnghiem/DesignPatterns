public class Main {
public static void main(String[] args) {
    Duck duck1 = new RedheadDuck();
    Duck duck2 = new RubberDuck();
    duck1.display();
    duck1.swim();
    duck1.doFly();
    duck1.doQuack();
    

    duck2.display();
    duck2.swim();
    duck2.doFly();
    duck2.doQuack();

    DuckCall duckCall = new RedheadCall();
    duckCall.display();
    duckCall.callDuck();
}
}
