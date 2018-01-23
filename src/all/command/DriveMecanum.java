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
        double y = OI.scalespeed(-OI.deadZone(OI.driverPad.getX(GenericHID.Hand.kLeft), RobotMap.getTranslationalDeadzone()), 1);
        double x = OI.scalespeed(OI.deadZone(OI.driverPad.getY(GenericHID.Hand.kLeft), RobotMap.getTranslationalDeadzone()), 1);
        double twist = OI.scalespeed(OI.deadZone(OI.driverPad.getX(GenericHID.Hand.kRight), RobotMap.getTranslationalDeadzone()), 1);

        Robot.drivetrain.getDrivetrain().driveCartesian(x, y, twist, 0);
    }

    protected void execute(){

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
