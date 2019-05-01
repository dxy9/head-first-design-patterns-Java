package headfirst.command.simpleremote.practice;

/**
 * @author linhaicheng on 2019/05/01
 */
public class RemoteControllerTest1 {

    public static void main(String[] args) {
        SimpleRemoteControl1 simpleRemoteControl1 = new SimpleRemoteControl1();
        Light1 light1 = new Light1();
        LightOnComand1 lightOnComand1 = new LightOnComand1(light1);
        simpleRemoteControl1.setCommand1(lightOnComand1);
        simpleRemoteControl1.execute();
    }
}
