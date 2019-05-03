package headfirst.strategy.interfacedemo;

/**
 * @author linhaicheng on 2019/05/03
 */
public class MallardDuck extends Duck implements Flyable,Quackable{
    @Override
    public void display() {
        System.out.println("mallardDuck is gray");
    }

    @Override
    public void fly() {
        System.out.println("mallardDuck can fly");
    }

    @Override
    public void quack() {
        System.out.println("mallardDuck can quack");
    }
}
