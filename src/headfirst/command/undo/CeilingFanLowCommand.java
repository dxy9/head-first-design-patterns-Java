package headfirst.command.undo;

/**
 * Created by Gavin on 2017/3/14.
 */
public class CeilingFanLowCommand extends BaseCeilingFanCommand {


    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }

}
