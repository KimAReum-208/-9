

/**
 * Write a description of class MyApp here.
 *
 * @author (2017315002 김아름, 2018315022 이지연)
 * @version (2020.04.22)
 */
public class Robot 
{
    private double speed;
    
    public void RobotWalk(String signal, double speed)
    {
        if (signal.equals("녹색"))
            this.speed = speed;
        else if(signal.equals("노란색"))
            this.speed = speed * 1.2;
        else
            this.speed = 0;
    }
    public double getSpeed(){
        return this.speed;
    }
}
