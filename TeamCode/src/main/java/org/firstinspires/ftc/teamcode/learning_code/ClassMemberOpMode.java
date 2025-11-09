package org.firstinspires.ftc.teamcode.learning_code;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class ClassMemberOpMode extends OpMode {
    boolean initDone ;
    @Override
    public void init(){
        telemetry.addData("init done", initDone);
        initDone = true;
    }
    public void loop(){
        telemetry.addData("init done ",initDone);
    }
}
