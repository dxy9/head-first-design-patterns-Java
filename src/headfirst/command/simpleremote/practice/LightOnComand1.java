package headfirst.command.simpleremote.practice;

/**
 * @author linhaicheng on 2019/05/01
 */
public class LightOnComand1 implements Command1 {

    private Light1 light1;

    public LightOnComand1(Light1 light1) {
        this.light1 = light1;
    }

    @Override
    public void execute() {
        light1.on();
    }
}
