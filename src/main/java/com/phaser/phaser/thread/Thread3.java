package com.phaser.phaser.thread;

import java.util.concurrent.Phaser;

public class Thread3 extends Thread {

    private Phaser phaser;

    public Thread3 (Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run () {
        System.out.println("This is thread 3");
        phaser.arrive();
    }
    
}
