package headfirst.strategy.strategy.quackimpl;

import headfirst.strategy.strategy.base.QuackBehavior;

/**
 * Created by Gavin on 2017/2/10.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
