package headfirst.factory.simplefactory;

import java.util.ArrayList;

/**
 * Created by Gavin on 2017/3/9.
 */
public abstract class Pizza {
    String name;
    String dough/*面团*/;
    String sauce/*酱*/;
    ArrayList<String> toppings/*浇头*/ = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake/*烘烤*/() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box(){
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings){
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
