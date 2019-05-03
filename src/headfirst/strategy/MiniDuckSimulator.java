package headfirst.strategy;

import headfirst.strategy.strategy.base.Duck;
import headfirst.strategy.strategy.duckimpl.DecoyDuck;
import headfirst.strategy.strategy.duckimpl.MallardDuck;
import headfirst.strategy.strategy.duckimpl.ModelDuck;
import headfirst.strategy.strategy.duckimpl.RubberDuck;
import headfirst.strategy.strategy.quackimpl.FlyRocketPowered;

/**
 * Created by Gavin on 2017/2/10.
 */
public class MiniDuckSimulator/*迷你鸭模拟器*/ {
    public static void main(String[] args){
        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck/*橡皮鸭*/();
        DecoyDuck decoy = new DecoyDuck();

        Duck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();
        model.performQuack();
        System.out.println("-------------------");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
