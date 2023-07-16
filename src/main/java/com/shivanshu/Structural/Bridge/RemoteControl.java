package com.shivanshu.Structural.Bridge;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower() {
        System.out.println("Power Pressed");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeUp() {
        System.out.println("Volume Up Pressed");
        device.setVolume(device.getVolume() + 10);
    }

    public void volumeDown() {
        System.out.println("Volume Down Pressed");
        device.setVolume(device.getVolume() - 10);
    }

    public void channelUp() {
        System.out.println("Channel Up Pressed");
        device.setChannel(device.getChannel() + 1);
    }

    public void channelDown() {
        System.out.println("Channel Down Pressed");
        device.setChannel(device.getChannel() - 1);
    }
}
