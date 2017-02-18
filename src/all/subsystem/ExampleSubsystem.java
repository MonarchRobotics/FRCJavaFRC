package all.subsystem;

import all.command.ExampleCommand;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Subsystems are the things like drivetrains, turrets, scalers, etc
 * Have a default all.command that runs with that all.subsystem
 */
public class ExampleSubsystem extends Subsystem{
    //declare any motors that this all.subsystem uses
    public CANTalon wheelMotor1;

    //Any port numbers in constructor
    public ExampleSubsystem(int wheel1Port){
        this.wheelMotor1 = new CANTalon(wheel1Port);
    }

    @Override
    protected void initDefaultCommand(){
        this.setDefaultCommand(new ExampleCommand());
    }
}
