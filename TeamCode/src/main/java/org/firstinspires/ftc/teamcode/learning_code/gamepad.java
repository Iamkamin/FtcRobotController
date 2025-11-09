package org.firstinspires.ftc.teamcode.learning_code;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp
@Disabled
public class gamepad extends OpMode {
    @Override
    public void init(){

    }

    @Override
    public void loop(){
       if (gamepad1.right_bumper) {

           telemetry.addLine("right bumper is pressed");
       }

       if (gamepad1.left_bumper) {

             telemetry.addLine("left bumper is pressed");

       }
    }
}
