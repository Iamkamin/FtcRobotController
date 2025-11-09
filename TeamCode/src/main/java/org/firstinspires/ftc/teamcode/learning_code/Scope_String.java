package org.firstinspires.ftc.teamcode.learning_code;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp()
@Disabled
public class Scope_String extends OpMode {
    @Override
    public void init() {
      String name = "Micheal Jackson";
      telemetry.addData("My name is ",name);

    }

    @Override
    public void loop() {
         int x = 5;
        { int y = 4; }

    }
}