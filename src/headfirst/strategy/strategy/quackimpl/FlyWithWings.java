package headfirst.strategy.strategy.quackimpl;

import headfirst.strategy.strategy.base.FlyBehavior;

/**
 * Created by Gavin on 2017/2/10.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("I'm flying!!");
    }
}
