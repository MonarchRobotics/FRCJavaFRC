package all.command;

import all.Robot;
import all.OI;
import all.RobotMap;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

/**
 * uses motor from subsystem to do stuff
 */
public class DriveMecanum extends Command {
    public DriveMecanum(){
        requires(Robot.drivetrain);
    }

    protected void initialize(){
    }

    protected void execute(){
        double y = OI.scaleSpeed(-OI.deadZone(OI.driverPad.getX(GenericHID.Hand.kLeft), RobotMap.getTranslationalDeadzone()), 1);
        double x = OI.scaleSpeed(-OI.deadZone(OI.driverPad.getY(GenericHID.Hand.kLeft), RobotMap.getTranslationalDeadzone()), 1);
        double twist = OI.scaleSpeed(OI.deadZone(OI.driverPad.getX(GenericHID.Hand.kRight), RobotMap.getTranslationalDeadzone()), 1);

        Robot.drivetrain.getDrivetrain().driveCartesian(x, y, twist);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    protected void end(){

    }

    protected void interrupted(){

    }
}
