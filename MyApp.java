
/**
 * Write a description of class MyApp here.
 *
 * @author (2017315002 김아름, 2018315022 이지연)
 * @version (2020.04.09)
 */
public class MyApp
{
    String signal = "녹색";
    double speed = 10;
    public void RobotWalk()
    {
        if (signal == "녹색");
        
        else if(signal == "노란색")
            speed = speed * 1.2;
        else
            speed = 0;
    }
}
