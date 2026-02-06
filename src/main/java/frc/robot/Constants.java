// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class TurretConstants {
    public static int turretMotionMagicExpoK_V;
    public static int turretMotionMagicExpoK_A;
    public static int turretMotionMagicAccel;
    public static int turretMotionMagicJerk;
    public static int SupplyCurrentLimit;
    public static int StatorCurrentLimit;
    public static int turretMotorID;
    public static int PASS_AIM_Position;
    public static int HUB_AIM_Position;
    public static int TRENCH_PRESET_Position;
    public static double[] turretPID = {0, 0, 0};
    public static double[] turretSVA = {0, 0, 0};
    public enum TurretWantedState {
      IDLE,
      AIM,
      TRENCH_PRESET,
      CLOSE_PRESET
      
    }
    public enum SystemState {
      IDLING,
      PASS_AIMING,
      HUB_AIMING,
      TRENCH_PRESETTING,
      CLOSE_PRESETTING
    }
  }
}
