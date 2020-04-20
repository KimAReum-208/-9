
import java.util.Scanner;
/**
 * Write a description of class MyApp here.
 *
 * @author (2017315002 김아름, 2018315022 이지연)
 * @version (2020.04.09)
 */
public class MyApp
{
    public static void main(String args[]){
        String signal = "녹색";
        System.out.print("speed = ");
        Scanner scanner = new Scanner(System.in);
        double speed = scanner.nextDouble();
        
        Robot robot = new Robot();
        robot.RobotWalk(signal, speed);
    }
}
