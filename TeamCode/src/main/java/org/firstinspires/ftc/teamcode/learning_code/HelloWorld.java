package org.firstinspires.ftc.teamcode.learning_code;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import  com.qualcomm.robotcore.eventloop.opmode.OpMode;


@Autonomous()
@Disabled
 public class HelloWorld extends OpMode{
    @Override
    public void init() {
        telemetry.addData("monkey","YE");
    }

    public void loop() {

    }
}