/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.oh.k12.wkw.cart.circuitPi.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import us.oh.k12.wkw.cart.circuitPi.RobotMap;
import us.oh.k12.wkw.cart.circuitPi.commands.DriveDoNothing;

/**
 *
 * @author Joy
 */
public class DriveSystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    SpeedController leftMotor = new Jaguar(RobotMap.leftMotor);
    SpeedController rightMotor = new Jaguar(RobotMap.rightMotor);
     
   
    /*public static final double pi = .7;
    public void robotWeight(){
        if(RobotMap.weightSensor()>=5)
        {
            pi += .2;
        }
        else
        {
            pi += .1*(RobotMap.weightSensor());
        }
    }
    */

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        leftMotor.set(0);
        rightMotor.set(0);
    }
    
    public void driveForward() {
        leftMotor.set(0.7);
        rightMotor.set(0.7);
    }
    
    public void driveBackwards() {
        leftMotor.set(-0.7);
        rightMotor.set(-0.7);
    }
        
    public void driveTurnLeft() {
        leftMotor.set(-0.7);
        rightMotor.set(0.7);
    }
    
    public void driveTurnRight() {
        leftMotor.set(0.7);
        rightMotor.set(-0.7);
    }
    
    public void doNothing() {
        leftMotor.set(0.0);
        rightMotor.set(0.0);
    }
         
   
}
