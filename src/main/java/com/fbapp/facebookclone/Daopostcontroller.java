package com.fbapp.facebookclone;
import java.util.ArrayList;

public class Daopostcontroller {

        ArrayList<Daopost> postList = new ArrayList();
        public void postAdd(Daopost postadd){
            postList.add(postadd);
        }
        public void postDelete(Daopost postdelete) {
           postList.remove(postdelete);
        }


}
