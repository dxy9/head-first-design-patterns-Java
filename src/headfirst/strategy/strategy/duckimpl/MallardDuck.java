package headfirst.strategy.strategy.duckimpl;

import headfirst.strategy.strategy.quackimpl.FlyWithWings;
import headfirst.strategy.strategy.quackimpl.Quack;
import headfirst.strategy.strategy.base.Duck;

/**
 * Created by Gavin on 2017/2/10.
 */
public class MallardDuck/*野鸭*/ extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
