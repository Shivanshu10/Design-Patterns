package com.shivanshu.Behavioral.State;

public class LockedState extends State {
    public LockedState(AudioPlayer player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    void clickLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));

            System.out.println("Stopped Playing");
        } else {
            System.out.println("Locked");
        }
    }

    @Override
    void clickPlay() {
        player.changeState(new ReadyState(player));

        System.out.println("Ready");
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
