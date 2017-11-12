package com.project.ndondot.challenge;

/**
 * Created by a_pri on 11/12/2017.
 */

public class KontenModel {
    int thumbnail, pp;
    String duration, title, uploader;

    public KontenModel(int thumbnail, int pp, String duration, String title, String uploader) {
        this.thumbnail = thumbnail;
        this.pp = pp;
        this.duration = duration;
        this.title = title;
        this.uploader = uploader;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }
}
