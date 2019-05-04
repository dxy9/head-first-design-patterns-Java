package headfirst.factory.simplefactory;

/**
 * Created by Gavin on 2017/3/9.
 */
public class ClamPizza/*蛤蜊比萨饼*/ extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
