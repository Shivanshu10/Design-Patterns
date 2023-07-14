package com.shivanshu.Structural.Facade;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        VideoFile mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
