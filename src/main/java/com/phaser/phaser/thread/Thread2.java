package com.phaser.phaser.thread;

import java.util.concurrent.Phaser;

public class Thread2 extends Thread {

    private Phaser phaser;

    public Thread2 (Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run () {
        System.out.println("This is thread 2");
        phaser.arrive();
    }
    
}
