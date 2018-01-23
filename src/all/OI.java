package all;

import edu.wpi.first.wpilibj.XboxController;

/**
 * Holds controllers, buttons, etc
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // robot.commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the all.command when the button is pressed and let it run the all.command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new DriveMecanum());

    // Run the all.command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new DriveMecanum());

    // Start the all.command when the button is released  and let it run the all.command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new DriveMecanum());

    public static XboxController driverPad;

    public OI(){
        //Initialize Joysticks and stuff
        driverPad = new XboxController(0);
    }

    // Dead zone function, used to avoid moving when joystick jitters
    // a tiny bit
    public static double deadZone(double val, double deadZone) {
        // Return a new percentage based on the living zone
        if(Math.abs(val) > deadZone) {
            if(val > 0) {
                return (val - deadZone) / (1 - deadZone);
            } else {
                return -(-val - deadZone) / (1 - deadZone);
            }
        }
        return 0;
    }

    public static double scalespeed(double val, double scalespeed) {
        return val * scalespeed;
    }

}
