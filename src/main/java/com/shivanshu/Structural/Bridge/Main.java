package com.shivanshu.Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tv time");
        Device tv = new TV();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();

        System.out.println("Radio time");
        Device radio = new Radio();
        AdvancedRemoteControl rempoteAdv = new AdvancedRemoteControl(radio);
        remote.togglePower();
        rempoteAdv.mute();
    }
}
