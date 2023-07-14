package com.shivanshu.Structural.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Video> videos = new ArrayList<>();
        videos.add(new Video());
        videos.add(new Video());
        videos.add(new Video());

        ThirdPartyYouTubeLib service = new ThirdPartyYoutubeClass(videos);
        ThirdPartyYouTubeLib proxy = new CachedYoutubeClass(service);

        proxy.downloadVideo(2);
    }
}
