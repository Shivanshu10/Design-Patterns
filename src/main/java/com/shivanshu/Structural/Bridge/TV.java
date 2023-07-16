package com.shivanshu.Structural.Bridge;

public class TV implements Device{
    boolean isOn = false;
    int volume = -1;
    int channel = -1;

    @Override
    public boolean isEnabled() {
        return isOn;
    }

    @Override
    public void enable() {
        isOn = true;
        volume = 0;
        channel = 1;
    }

    @Override
    public void disable() {
        isOn = false;
        volume = -1;
        channel = -1;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
