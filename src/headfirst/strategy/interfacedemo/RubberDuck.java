package headfirst.strategy.interfacedemo;

/**
 * @author linhaicheng on 2019/05/03
 */
public class RubberDuck extends  Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("RubberDuck is rubber");
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck can zhizhi");
    }
}
