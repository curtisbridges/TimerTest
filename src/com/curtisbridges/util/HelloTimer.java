package com.curtisbridges.util;

import java.util.Timer;
import java.util.TimerTask;

public class HelloTimer extends TimerTask {
    protected Timer m_timer;

    public HelloTimer() {
        m_timer = new Timer();
        m_timer.schedule(this, 0, 1000);
    }

    public void run() {
        System.out.println("Hello, World!");
    }

    public void stop() {
        m_timer.cancel();
    }

    public static void main(String[] args) {
        HelloTimer timer = new HelloTimer();
        try {
            Thread.sleep(5000);
        }
        catch (Exception exc) {}

        timer.stop();
    }
}
