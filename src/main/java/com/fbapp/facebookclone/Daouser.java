package com.fbapp.facebookclone;

public class Daouser {

    String userid;
    String username;
    String emailid;
    String password;

    public Daouser(String userid, String username, String emailid, String password ) {
        this.userid = userid;
        this.username = username;
        this.emailid = emailid;
        this.password = password;


    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
