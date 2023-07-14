package com.shivanshu.Behavioral.State;

public class ReadyState extends State {
    public ReadyState(AudioPlayer player) {
        super(player);
    }

    @Override
    void clickLock() {
        player.changeState(new LockedState(player));

        System.out.println("Locked");
    }

    @Override
    void clickPlay() {
        player.changeState(new PlayingState(player));

        System.out.println("Playing Song");
    }

    @Override
    void clickNext() {
        System.out.println("Locked");
    }

    @Override
    void clickPrev() {
        System.out.println("Locked");
    }
}
