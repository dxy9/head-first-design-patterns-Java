package headfirst.strategy.strategy.duckimpl;

import headfirst.strategy.strategy.quackimpl.FlyNoWay;
import headfirst.strategy.strategy.base.Duck;
import headfirst.strategy.strategy.quackimpl.MuteQuack;

/**
 * Created by Gavin on 2017/2/10.
 */
public class DecoyDuck/*诱饵鸭*/ extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack/*静音嘎嘎*/());
    }

    @Override
    public void display() {
        System.out.print("I'm a duck Decoy");
    }

}
