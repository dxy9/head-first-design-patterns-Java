package headfirst.decorator.starbuzzWithSizes;

/**
 * Created by Gavin on 2017/3/8.
 */
public abstract class Beverage {
    public enum Size { TALL/*中杯*/, GRANDE/*大杯*/, VENTI/*超大杯*/ };
    Size size = Size.TALL;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}
