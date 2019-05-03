package headfirst.strategy.abstractclassdemo;

/**
 * @author linhaicheng on 2019/05/03
 */
public abstract class Duck {
    public void quack(){
        System.out.println("duck is all can quack");
    }
    public void swim(){
        System.out.println("duck is all can swim");
    }
    public abstract void display();

    //新的需求,飞的功能
    //public void fly(){System.out.println("duck is all can fly");}
}
