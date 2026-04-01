package frc.robot.subsystems.Scoring;


import frc.robot.Constants.ClimberConstants;
import frc.robot.Constants.ClimberConstants.ClimberWantedState;
import frc.robot.Constants.ClimberConstants.ClimberSystemState;

public class Climber {

    private ClimberWantedState wantedState; 
    private ClimberSystemState currentSystemState;

    public void setWantedClimberState(ClimberWantedState climberState) {
        this.wantedState = climberState; 
    }
    private SystemState changeCurrentSystemState() {
        return switch (wantedState) {
            case IDLE -> SystemState.IDLING:
            case L1AUTOCLIMB-> SystemState.L1AUTOCLIMBING:
            case L1TELEOPCLIMB -> SystemState.L1TELEOPCLIMBING: 
        };
    }
       private double motorSpeed;

private void applyState() {
    switch (currentSystemState) {
        case IDLING:
            motorSpeed = 0.0;
            break;

        case L1AUTOCLIMBING:
            motorSpeed = ClimberConstants.L1AutoSpeed;
            break;

        case L1TELEOPCLIMBING:
            motorSpeed = ClimberConstants.L1TELEOPSpeed;
            break;
    }
}
}

