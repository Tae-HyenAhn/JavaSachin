package com.sachin.java.javasachin;

/**
 * Created by ahntaehyen on 15. 9. 19..
 */
public class User {
    private int num;
    private String name, nick;
    private boolean sex;
    private String selfDesc;
    private int profile;


    public User(int num, String name, String nick, boolean sex, String selfDesc, int profile) {
        this.num = num;
        this.name = name;
        this.nick = nick;
        this.sex = sex;
        this.selfDesc = selfDesc;
        this.profile = profile;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getSelfDesc() {
        return selfDesc;
    }

    public void setSelfDesc(String selfDesc) {
        this.selfDesc = selfDesc;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }
}
