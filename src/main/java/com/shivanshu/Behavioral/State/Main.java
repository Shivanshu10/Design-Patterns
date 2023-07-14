package com.shivanshu.Behavioral.State;

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        System.out.println("Playing Something");
        player.clickPlay();

        System.out.println("Let's stop this song");
        player.clickPlay();

        System.out.println("Lets play again and next song");
        player.clickPlay();
        player.clickNext();

        System.out.println("No go back");
        player.clickPrev();

        player.clickLock();
    }
}
