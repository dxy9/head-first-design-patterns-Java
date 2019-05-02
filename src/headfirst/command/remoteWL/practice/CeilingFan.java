package headfirst.command.remoteWL.practice;

/**
 * @author linhaicheng on 2019/05/02
 */
public class CeilingFan/*吊扇*/ {
    private String location;
    private int level;

    public CeilingFan(String location) {
        this.location = location;
    }

    public static final int LOW=1;
    public static final int MEDIUM=2;
    public static final int HIGHT=3;

    public void turnOff(){
        System.out.println(location+" ceiling fan is off");
    }
    public void turnLow(){
        level=LOW;
        System.out.println(location+" ceiling fan is low");
    }
    public void turnMedium(){
        level=MEDIUM;
        System.out.println(location+" ceiling fan is medium");
    }
    public void turnHight(){
        level=HIGHT;
        System.out.println(location+" ceiling fan is hight");
    }

    public int getLevel(){
        return level;
    }

}
