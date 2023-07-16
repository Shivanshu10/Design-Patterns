package com.shivanshu.Structural.Bridge;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    void mute() {
        System.out.println("Mute Pressed");
        device.setVolume(0);
    }
}
