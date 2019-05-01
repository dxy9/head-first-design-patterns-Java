package headfirst.command.simpleremote.practice;

/**
 * @author linhaicheng on 2019/05/01
 */
public class SimpleRemoteControl1 {
    private Command1 command1;

    public void setCommand1(Command1 command1) {
        this.command1 = command1;
    }

    public void execute(){
        command1.execute();
    }
}
