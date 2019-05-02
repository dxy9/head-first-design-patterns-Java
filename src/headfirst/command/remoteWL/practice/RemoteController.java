package headfirst.command.remoteWL.practice;

/**
 * @author linhaicheng on 2019/05/02
 */
public class RemoteController {

    Command[] onCommands=new Command[3];
    Command[] offCommands=new Command[3];

    //1 在构造方法中进行命令的初始化

    public RemoteController() {
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i]=()->{};
            offCommands[i]=()->{};

        }
    }
    //1.5 为卡槽添加命令
    public void addCommand(int sort,Command onCommand,Command offCommand){
        onCommands[sort]=onCommand;
        offCommands[sort]=offCommand;
    }

    //2 按下按钮执行命令
    public void pressOnButton(int sort){
        onCommands[sort].execute();
    }
    public void pressOffButton(int sort){
        offCommands[sort].execute();
    }

    //重写toString

    //@Override
    //public String toString() {
    //    StringBuilder stringBuilder = new StringBuilder();
    //    stringBuilder.append("\n-----------")
    //}
}
