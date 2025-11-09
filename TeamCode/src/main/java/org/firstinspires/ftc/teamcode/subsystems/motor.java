package org.firstinspires.ftc.teamcode.subsystems;

import dev.nextftc.core.commands.Command;
import dev.nextftc.core.subsystems.Subsystem;
import dev.nextftc.hardware.impl.MotorEx;
import dev.nextftc.hardware.impl.ServoEx;
import dev.nextftc.hardware.positionable.SetPosition;
import dev.nextftc.hardware.powerable.SetPower;

public class motor implements Subsystem {
    public static  final motor INSTANCE = new motor();
    private motor() {};
    public MotorEx m1 = new MotorEx("motor1");
    public ServoEx x1 = new ServoEx("sevo1");
    public Command m1_on = new SetPower(m1,0.4).requires(this);
    public Command m1_off = new SetPower(m1,0).requires(this);
    public Command x1_on = new SetPosition(x1,0.4).requires(this);
    public Command x1_off = new SetPosition(x1,0).requires(this);

}