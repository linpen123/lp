package com.lp.springhome.model.controller;

public class TicketWindowRunnable implements Runnable {
    private int index=1;
    private final static int max=50;
    @Override
    public void run() {
        while (index<=max){
            System.out.println(Thread.currentThread()+"号码是："+(index++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
