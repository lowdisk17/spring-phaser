package com.phaser.phaser.thread;

import java.util.concurrent.Phaser;

public class Thread1 extends Thread {

    private Phaser phaser;

    public Thread1 (Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run () {
        System.out.println("This is thread 1");
        phaser.arrive();
    }
    
}
