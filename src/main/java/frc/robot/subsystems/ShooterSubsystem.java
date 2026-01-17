package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.*;

public class ShooterSubsystem extends SubsystemBase{
    //Subsystems

    //Shooter Motors
    private static TalonFX shootermotor1;
    private static TalonFX shootermotor2;
    //Feeding Motor
    private static TalonFX feedermoter;
    //Constructor
    public ShooterSubsystem() {
        shootermotor1 = new TalonFX(SHOOTER_MOTER_1_ID);
        shootermotor2 = new TalonFX(SHOOTER_MOTER_2_ID);
        feedermoter = new TalonFX(FEEDER_MOTER_ID);
    }
    //Commands
        //Go
    public Command setShootSpeed(double shootSpeed) {
        return run(() -> {shootermotor1.set(shootSpeed);
        });
    }

    public Command setFeederSpeed(double FeederSpeed) {
        return run(() -> {feedermoter.set(FeederSpeed);
        });
    }

        //Stop
    // public Command stopShooter(double shootStop) {
    //     return runOnce(() -> {
    //         shootermotor1.set(0);
    //         shootspeed
    //     });
    // }
    
    //Periodic
}
