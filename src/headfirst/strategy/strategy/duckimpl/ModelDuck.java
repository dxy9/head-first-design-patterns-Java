package headfirst.strategy.strategy.duckimpl;

import headfirst.strategy.strategy.quackimpl.FlyNoWay;
import headfirst.strategy.strategy.quackimpl.Quack;
import headfirst.strategy.strategy.base.Duck;

/**
 * Created by Gavin on 2017/2/10.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
