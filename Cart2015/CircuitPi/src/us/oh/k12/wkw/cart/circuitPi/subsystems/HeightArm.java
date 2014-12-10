/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.oh.k12.wkw.cart.circuitPi.subsystems;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import us.oh.k12.wkw.cart.circuitPi.RobotMap;
import us.oh.k12.wkw.cart.circuitPi.commands.ArmDoNothing;

/**
 *
 * @author Joy
 */
public class HeightArm extends PIDSubsystem {

    private static final double Kp = 0.0;
    private static final double Ki = 0.0;
    private static final double Kd = 0.02;

    // Initialize your subsystem here
    public static final double LOWERED = 2;
    public static final double RAISED = 6;
    public static final double MIDDLE_HEIGHT = 4;
    
    SpeedController motor = new Jaguar(RobotMap.armHeightMotor);
    AnalogChannel height = new AnalogChannel(RobotMap.heightFinder);
            

    
    public HeightArm() {
        super("HeightArm", Kp, Ki, Kd);

        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        setSetpoint(LOWERED);
        enable();
        // enable() - Enables the PID controller.
    }
    
    public void initDefaultCommand() {

        // Set the default command for a subsystem here.
        setDefaultCommand(new ArmDoNothing());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return 0.0;
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
    
    public void armDoNothing() {
        motor.set(0.0);
    }
    
    public void armRise() {
        motor.set(0.7);
    }
    
    public void armLower() {
        motor.set(-0.7);
    }
}
