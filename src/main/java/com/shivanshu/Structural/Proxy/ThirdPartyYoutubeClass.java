package com.shivanshu.Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ThirdPartyYoutubeClass implements ThirdPartyYouTubeLib {
    private List<Video> videos;

    public ThirdPartyYoutubeClass(List<Video> videos) {
        this.videos = videos;
    }

    @Override
    public List<Video> listVideo() {
        System.out.println("listing videos");
        return videos;
    }

    @Override
    public Video getVideoInfo(int id) {
        System.out.println("Getting video");
        return videos.get(id);
    }

    @Override
    public void downloadVideo(int id) {
        System.out.println("Downloading video");
    }
}
