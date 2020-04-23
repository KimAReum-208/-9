

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RobotTest.
 *
 * @author  (2017315002 김아름, 2018315022 이지연)
 * @version (2020.04.22)
 */
public class RobotTest
{
    /**
     * Default constructor for test class RobotTest
     */
    public RobotTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void RobotWalk_Test_1()
    {
        Robot robot1 = new Robot();
        robot1.RobotWalk("녹색", 10.0);
        assertEquals(10.0, robot1.getSpeed(), 0.0);
    }

    @Test
    public void RobotWalk_Test_2()
    {
        Robot robot1 = new Robot();
        robot1.RobotWalk("노란색", 10.0);
        assertEquals(12.0, robot1.getSpeed(), 0.0);
    }

    @Test
    public void RobotWalk_Test_3()
    {
        Robot robot2 = new Robot();
        robot2.RobotWalk("붉은색", 10.0);
        assertEquals(0.0, robot2.getSpeed(), 0.0);
    }
}



