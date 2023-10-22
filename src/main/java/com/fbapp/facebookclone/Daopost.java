package com.fbapp.facebookclone;

public class Daopost {

    String postid;
    String caption;
    int likes;
    String comments;



    public Daopost(String postid, String caption, int likes, String comments) {
        this.postid = postid;
        this.caption = caption;
        this.likes = likes;
        this.comments = comments;


    }

    public String getPostid() {
        return postid;
    }
    public void setPostid(String postid) {
        this.postid = postid;
    }
    public String getCaption() {
        return caption;
    }

    public void setCaption(String username) {
        this.caption = caption;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


}
