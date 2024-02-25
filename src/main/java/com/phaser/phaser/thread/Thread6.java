package com.phaser.phaser.thread;

import java.util.concurrent.Phaser;

public class Thread6 extends Thread {

    private Phaser phaser;

    public Thread6 (Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run () {
        System.out.println("This is thread 6");
        phaser.arriveAndAwaitAdvance();
        System.out.println("This is thread 6 resumes");
    }
    
}
