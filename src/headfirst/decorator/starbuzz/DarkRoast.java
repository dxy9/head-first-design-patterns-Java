package headfirst.decorator.starbuzz;

/**
 * Created by Gavin on 2017/3/7.
 */
public class DarkRoast/*黑咖啡*/ extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }

}
