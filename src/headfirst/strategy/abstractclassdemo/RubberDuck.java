package headfirst.strategy.abstractclassdemo;

/**
 * @author linhaicheng on 2019/05/03
 */
public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("rubberDuck is zhi zhi quack");
    }

    @Override
    public void display() {
        System.out.println("rubberDuck is rubber");
    }
}
