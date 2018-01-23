package all;

/**
 * The robot.all.RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //basically just holds all the ports
    //a lot easier to change motor ports this way
    private final static int frontleft = 1;
    private final static int frontRight = 0;
    private static final int rearLeft = 2;
    private static final int rearRight = 3;

    private static final double translationalDeadzone = 0.1;

    public static int getFrontleft() { return frontleft; }
    public static int getFrontRight() { return frontRight; }
    public static int getRearLeft() { return rearLeft; }
    public static int getRearRight() { return rearRight;}

    public static double getTranslationalDeadzone() {
        if (translationalDeadzone == 1) {
            return 0.99;
        }
        return translationalDeadzone;
    }
}
