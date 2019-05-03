package headfirst.strategy.strategy.duckimpl;

import headfirst.strategy.strategy.quackimpl.FlyWithWings;
import headfirst.strategy.strategy.quackimpl.Quack;
import headfirst.strategy.strategy.base.Duck;

/**
 * Created by Gavin on 2017/2/10.
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
