package headfirst.decorator.starbuzz;

/**
 * Created by Gavin on 2017/3/7.
 */
public class Espresso/*浓缩咖啡*/ extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override

    public double cost() {
        return 1.99;
    }
}
