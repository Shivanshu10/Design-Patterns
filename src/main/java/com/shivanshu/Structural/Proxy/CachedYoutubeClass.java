package com.shivanshu.Structural.Proxy;

import java.util.List;

public class CachedYoutubeClass implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib service;
    private List<Video> videosCache;
    private boolean needReset = false;
    private Video videoCache;

    public CachedYoutubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    @Override
    public List<Video> listVideo() {
        if (videosCache == null || needReset) {
            videosCache = service.listVideo();
        }
        return videosCache;
    }

    @Override
    public Video getVideoInfo(int id) {
        if (videoCache == null || needReset) {
            videoCache = service.getVideoInfo(id);
        }
        return videoCache;
    }

    @Override
    public void downloadVideo(int id) {
        service.downloadVideo(id);
    }
}
