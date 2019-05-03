package headfirst.command.undo;

/**
 * @author linhaicheng on 2019/05/03
 */
public abstract class BaseCeilingFanCommand implements Command {
    protected CeilingFan ceilingFan;
    protected int prevSpeed;

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
