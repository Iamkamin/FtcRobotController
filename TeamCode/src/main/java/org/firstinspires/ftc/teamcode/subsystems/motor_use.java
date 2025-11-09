package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


import dev.nextftc.core.components.BindingsComponent;
import dev.nextftc.core.components.SubsystemComponent;
import dev.nextftc.ftc.Gamepads;
import dev.nextftc.ftc.NextFTCOpMode;
import dev.nextftc.ftc.components.BulkReadComponent;

@TeleOp(name = "bob")
public class motor_use extends NextFTCOpMode {
    public motor_use() {
        addComponents(new SubsystemComponent(
                        motor.INSTANCE
                ),
                BulkReadComponent.INSTANCE,
                BindingsComponent.INSTANCE
        );
    }
    @Override
    public void onStartButtonPressed() {
        Gamepads.gamepad1().dpadUp().whenBecomesTrue(
                motor.INSTANCE.m1_on
        );
        Gamepads.gamepad1().dpadDown().whenBecomesTrue(
                motor.INSTANCE.m1_off
        );
        Gamepads.gamepad1().dpadLeft().whenBecomesTrue(
                motor.INSTANCE.x1_on
        );
        Gamepads.gamepad1().dpadRight().whenBecomesTrue(
                motor.INSTANCE.x1_off
        );
    }
}