package all;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import all.subsystem.Drivetrain;

/**
 * Created by cooper on 2/18/17.
 */
public class Robot extends IterativeRobot {
    /*
    * Need to initialize all.OI, subsytems
    * */
    public static Drivetrain drivetrain = new Drivetrain(RobotMap.getFrontleft());

    @Override
    public void robotInit(){
        //This is called once when robot starts

    }

    @Override
    public void disabledPeriodic(){
        //is called maybe when disabled?
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit(){
        //called once when autonomous period starts

    }

    @Override
    public void autonomousPeriodic(){
        //called periodically during autonomous

    }

    @Override
    public void teleopInit(){
        //called once when teleoperated period begins

    }

    @Override
    public void disabledInit(){
        //called once when disabled

    }

    @Override
    public void teleopPeriodic(){
        //called during operator control
        Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic(){
        //called during test mode
        LiveWindow.run();
    }
}
