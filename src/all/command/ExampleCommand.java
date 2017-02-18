package all.command;

import all.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * uses motor from subsystem to do stuff
 */
public class ExampleCommand extends Command {
    public ExampleCommand(){
        requires(Robot.exampleSubsystem);
    }

    protected void initialize(){

    }

    protected void execute(){
        Robot.exampleSubsystem.wheelMotor1.set(1.0);
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
