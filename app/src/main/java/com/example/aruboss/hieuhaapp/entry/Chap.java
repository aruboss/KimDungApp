package com.example.aruboss.hieuhaapp.entry;

import java.util.Date;

/**
 * Created by Admin on 7/5/2017.
 */

public class Chap  {
   private   int deID,stID;
    private String deName, deSource,deContent;
    private Date deDate;

    public Chap() {
    }

    public Chap(int deID, int stID, String deName, String deSource, String deContent, Date deDate) {
        this.deID = deID;
        this.stID = stID;
        this.deName = deName;
        this.deSource = deSource;
        this.deContent = deContent;
        this.deDate = deDate;
    }

    public int getDeID() {
        return deID;
    }

    public void setDeID(int deID) {
        this.deID = deID;
    }

    public int getStID() {
        return stID;
    }

    public void setStID(int stID) {
        this.stID = stID;
    }

    public String getDeName() {
        return deName;
    }

    public void setDeName(String deName) {
        this.deName = deName;
    }

    public String getDeSource() {
        return deSource;
    }

    public void setDeSource(String deSource) {
        this.deSource = deSource;
    }

    public String getDeContent() {
        return deContent;
    }

    public void setDeContent(String deContent) {
        this.deContent = deContent;
    }

    public Date getDeDate() {
        return deDate;
    }

    public void setDeDate(Date deDate) {
        this.deDate = deDate;
    }
}
