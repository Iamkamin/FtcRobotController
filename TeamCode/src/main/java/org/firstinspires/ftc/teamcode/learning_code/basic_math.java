package org.firstinspires.ftc.teamcode.learning_code;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class basic_math extends OpMode {
    @Override
    public void init(){

    }
    @Override
    public void loop(){
        double SPEED = gamepad1.left_trigger/2 ;
        telemetry.addData("STATUS","SPEED =",SPEED);
    }
}

