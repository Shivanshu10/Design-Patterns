package com.shivanshu.Behavioral.State;

public class PlayingState extends State {
    public PlayingState(AudioPlayer player) {
        super(player);
    }

    @Override
    void clickLock() {
        player.changeState(new LockedState(player));

        System.out.println("Stop Playing");
    }

    @Override
    void clickPlay() {
        player.changeState(new ReadyState(player));

        System.out.println("Paused");
    }

    @Override
    void clickNext() {
        System.out.println("Playing Next Song");
    }

    @Override
    void clickPrev() {
        System.out.println("Playing Prev Song");
    }
}
