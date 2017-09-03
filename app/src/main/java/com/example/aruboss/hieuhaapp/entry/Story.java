package com.example.aruboss.hieuhaapp.entry;

/**
 * Created by Admin on 6/5/2017.
 */

public class Story {
    private int stID;
    private String stName;
    private int auID;
    private String stImage;
    private String stDescribe;

    public Story() {
        this.auID = 1;
    }

    public Story(int stID, String stName, String stImage, String stDescribe) {

        this.stID = stID;
        this.stName = stName;
        this.auID = 1;
        this.stImage = stImage;
        this.stDescribe = stDescribe;
    }

    public int getStID() {

        return stID;
    }

    public void setStID(int stID) {
        this.stID = stID;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public int getAuID() {
        return auID;
    }

    public void setAuID(int auID) {
        this.auID = auID;
    }

    public String getStImage() {
        return stImage;
    }

    public void setStImage(String stImage) {
        this.stImage = stImage;
    }

    public String getStDescribe() {
        return stDescribe;
    }

    public void setStDescribe(String stDescribe) {
        this.stDescribe = stDescribe;
    }
}
