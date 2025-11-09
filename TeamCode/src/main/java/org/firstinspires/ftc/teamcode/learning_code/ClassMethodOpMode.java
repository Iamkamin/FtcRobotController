package org.firstinspires.ftc.teamcode.learning_code;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class ClassMethodOpMode extends OpMode {
    @Override
    public void init(){
    // empty of porpouse
    }
    double squareinputwhitsiqn(double input){
        double output = input * input;
        if(input > 0 ) {
            output = output * -1;
        }
        return output;
    }

    @Override
    public void loop(){
        double leftAmount = gamepad1.left_stick_x;
        double forwardAmount = -gamepad1.left_stick_y;

        telemetry.addData("before X", leftAmount);
        telemetry.addData("before Y", forwardAmount);

        leftAmount = squareinputwhitsiqn(leftAmount);
        forwardAmount = squareinputwhitsiqn(forwardAmount);

        telemetry.addData("after X", leftAmount);
        telemetry.addData("after Y", forwardAmount);

        telemetry.update();
    }
}
