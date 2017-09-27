//hopefully

package org.usfirst.frc.team1.robot.subsystems;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import org.usfirst.frc.team1.robot.RobotMap;


public class Wrist extends PIDSubsystem { // This system extends PIDSubsystem

	Victor motor = RobotMap.wristMotor;
	AnalogInput pot = RobotMap.wristPot();

	public Wrist() {
		super("Wrist", 2.0, 0.0, 0.0);// The constructor passes a name for the subsystem and the P, I and D constants that are sueed when computing the motor output
		setAbsoluteTolerance(0.05);
		getPIDController().setContinuous(false);
	}
	
    public void initDefaultCommand() {
    }

    protected double returnPIDInput() {
    	return pot.getAverageVoltage(); // returns the sensor value that is providing the feedback for the system
    }

    protected void usePIDOutput(double output) {
    	motor.pidWrite(output); // this is where the computed output value fromthe PIDController is applied to the motor
    }
}
