package headfirst.command.undo;

/**
 * Created by Gavin on 2017/3/14.
 */
public class CeilingFanOffCommand extends BaseCeilingFanCommand {

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

}
