package com.king.myrecyclerapp;

public class Item {
    private String fname,sname;
    private int poster;

    public Item(String fname, String sname, int poster) {
        this.fname = fname;
        this.sname = sname;
        this.poster = poster;
    }

    public Item() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
}
