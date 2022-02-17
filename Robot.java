// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This is a sample program demonstrating how to use an ultrasonic sensor and proportional control
 * to maintain a set distance from an object.
 */
public class Robot extends TimedRobot {
    private static final int kUltrasonicPort = 3;
  

  private final AnalogInput m_ultrasonic1 = new AnalogInput(kUltrasonicPort);
   
  @Override
  public void teleopPeriodic() {
    double dist_test1 = m_ultrasonic1.getValue()*0.0536;
    SmartDashboard.putNumber("Distance Test", dist_test1);
    
  }
}
