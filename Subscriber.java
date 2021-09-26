package com.company;

import java.util.List;
public class Subscriber implements Observer {

    private String nickname;
    public Subscriber(String nickname){
        this.nickname = nickname;
    }
    @Override
    public void update(List<String> notifications) {
        System.out.println("@"+nickname+" Instagram"+notifications);
    }
}
