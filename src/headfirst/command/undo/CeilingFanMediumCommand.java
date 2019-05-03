package headfirst.command.undo;

/**
 * Created by Gavin on 2017/3/14.
 */
public class CeilingFanMediumCommand extends BaseCeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }


}
