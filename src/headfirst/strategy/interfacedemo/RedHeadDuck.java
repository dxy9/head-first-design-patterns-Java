package headfirst.strategy.interfacedemo;

/**
 * @author linhaicheng on 2019/05/03
 */
public class RedHeadDuck extends Duck implements Flyable,Quackable {
    @Override
    public void display() {
        System.out.println("RedHeadDuck's head is red color");
    }

    @Override
    public void fly() {
        System.out.println("RedHeadDuck can fly");
    }

    @Override
    public void quack() {
        System.out.println("RedHeadDuck can quack");
    }
}
