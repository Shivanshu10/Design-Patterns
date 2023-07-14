package com.shivanshu.Structural.Proxy;

import java.util.List;

public interface ThirdPartyYouTubeLib {
    List<Video> listVideo();

    Video getVideoInfo(int id);

    void downloadVideo(int id);
}
