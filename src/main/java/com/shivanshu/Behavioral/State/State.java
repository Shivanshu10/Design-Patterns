package com.shivanshu.Behavioral.State;

public abstract class State {
    public AudioPlayer player;

    public State(AudioPlayer player) {
        this.player = player;
    }

    abstract void clickLock();

    abstract void clickPlay();

    abstract void clickNext();

    abstract void clickPrev();
}
