package com.lp.springhome.model.controller;

public class TicketWindow extends Thread {
    private final String name;
    private static final int max=50;
    private static int index=1;

    public TicketWindow(String name) {
        this.name = name;
    }
    public void run(){
        while (index<=max){
            System.out.println("柜台"+name+"当前号码："+(index++));
        }
    }
}
