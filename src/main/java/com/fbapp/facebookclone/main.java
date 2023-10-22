package com.fbapp.facebookclone;
import java.sql.Connection;
import java.util.Scanner;

public class main {

    static  Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        ConnectionUtil db =new ConnectionUtil();
         db.conn("postgres","postgres", "akanksha8080");

    }

}
