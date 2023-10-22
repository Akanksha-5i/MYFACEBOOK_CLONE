package com.fbapp.facebookclone;

import java.util.ArrayList;

public class Daousercontroller {
    ArrayList<Daouser> userList = new ArrayList();
    public void userAdd(Daouser useradd){
        userList.add(useradd);
    }

    public void userUpdate(Daouser userupdate) {
        userList.add(userupdate);
    }

   public void userDelete(Daouser userdelete){
    userList.remove(userdelete);
    }
}