package headfirst.command.undo;

/**
 * Created by Gavin on 2017/3/14.
 */
public class CeilingFanHighCommand extends BaseCeilingFanCommand{

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        // 这边必须加this TODO
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }


}
