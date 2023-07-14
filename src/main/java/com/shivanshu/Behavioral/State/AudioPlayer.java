package com.shivanshu.Behavioral.State;

public class AudioPlayer {
    private State state;

    private boolean playing;

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public AudioPlayer() {
        this.state = new ReadyState(this);
    }

    void changeState(State state) {
        this.state = state;
    }

    void clickLock() {
        System.out.println("Pause Clicked");
        state.clickLock();
    }

    void clickPlay() {
        System.out.println("Play Clicked");
        state.clickPlay();
    }

    void clickNext() {
        System.out.println("Next Clicked");
        state.clickNext();
    }

    void clickPrev() {
        System.out.println("Prev Clicked");
        state.clickPrev();
    }
}
