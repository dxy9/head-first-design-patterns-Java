package headfirst.factory.simplefactory;

/**
 * Created by Gavin on 2017/3/9.
 */
public class CheesePizza/*芝士披萨*/ extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust/*脆皮*/";
        sauce = "Marinara Pizza Sauce/*Marinara比萨酱*/";
        toppings.add("Fresh Mozzarella/*奶酪*/");
        toppings.add("Parmesan/*巴马*/");
    }
}
