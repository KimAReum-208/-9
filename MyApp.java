
/**
 * Write a description of class MyApp here.
 *
 * @author (2017315002 김아름, 2018315022 이지연)
 * @version (2020.04.09)
 */
public class MyApp
{   
    public static void main(String[] args){
        String signal = "빨간색";
        double speed = 10;
        System.out.println(RobotWalk(signal, speed));
    }
    public static double RobotWalk(String signal, double speed)
    {
        if (signal == "녹색");
        else if(signal == "노란색")
            speed = speed * 1.2;
        else
            speed = 0;
        return speed;
    }
}
