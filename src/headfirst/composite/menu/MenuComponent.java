package headfirst.composite.menu;

/**
 * Created by Gavin on 2017/3/21.
 */
public abstract class MenuComponent {
    //-----------------------------------------------------
    //node 节点的功能
    //-----------------------------------------------------
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    //-----------------------------------------------------
    // 节点共有的功能
    //-----------------------------------------------------

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
    //-----------------------------------------------------
    //leaf 节点的功能
    //-----------------------------------------------------
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

}
