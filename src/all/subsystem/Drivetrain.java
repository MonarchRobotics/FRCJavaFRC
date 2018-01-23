package all.subsystem;

import all.command.DriveMecanum;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

/**
 * Subsystems are the things like drivetrains, turrets, scalers, etc
 * Have a default all.command that runs with that all.subsystem
 */
public class Drivetrain extends Subsystem{
    //declare any motors that this all.subsystem uses
    public WPI_TalonSRX frontLeft, frontRight, rearLeft, rearRight;

    protected MecanumDrive robotDrive;

    //Any port numbers in constructor
    public Drivetrain(int frontLeft, int frontRight, int rearLeft, int rearRight){
        this.frontLeft = new WPI_TalonSRX(frontLeft);
        this.frontRight = new WPI_TalonSRX(frontRight);
        this.rearLeft = new WPI_TalonSRX(rearLeft);
        this.rearRight = new WPI_TalonSRX(rearRight);

        this.frontLeft.setNeutralMode(NeutralMode.Brake);
        this.frontRight.setNeutralMode(NeutralMode.Brake);
        this.rearLeft.setNeutralMode(NeutralMode.Brake);

        robotDrive = new MecanumDrive(this.frontLeft, this.frontRight, this.rearLeft, this.rearRight);
    }

    @Override
    protected void initDefaultCommand(){
        this.setDefaultCommand(new DriveMecanum());
    }

    public MecanumDrive getDrivetrain() { return robotDrive; }
}
