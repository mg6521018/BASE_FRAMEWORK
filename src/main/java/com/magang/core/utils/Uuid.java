package com.magang.core.utils;

import java.util.UUID;

/**
 * Created by magang on 2017/9/13.
 */
public class Uuid {
    public static String getId(){
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-","");
    }

    public static void main(String [] args){
        System.out.println(getId());
    }
}
