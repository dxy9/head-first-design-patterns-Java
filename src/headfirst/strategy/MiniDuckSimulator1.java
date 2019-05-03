package headfirst.strategy;

import headfirst.strategy.strategy.base.Duck;
import headfirst.strategy.strategy.duckimpl.MallardDuck;
import headfirst.strategy.strategy.duckimpl.ModelDuck;
import headfirst.strategy.strategy.quackimpl.FlyRocketPowered;

/**
 * Created by Gavin on 2017/2/10.
 */
public class MiniDuckSimulator1 {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
