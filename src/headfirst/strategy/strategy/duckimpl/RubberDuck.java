package headfirst.strategy.strategy.duckimpl;

import headfirst.strategy.strategy.quackimpl.FlyNoWay;
import headfirst.strategy.strategy.quackimpl.Squeak;
import headfirst.strategy.strategy.base.Duck;

/**
 * Created by Gavin on 2017/2/10.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}
