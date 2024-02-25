package com.phaser.phaser.thread;

import java.util.concurrent.Phaser;

public class Thread4 extends Thread {

    private Phaser phaser;

    public Thread4 (Phaser phaser) {
        this.phaser = phaser;
    }

    @Override
    public void run () {
        System.out.println("This is thread 4");
        phaser.arriveAndAwaitAdvance();
        System.out.println("This is thread 4 resumes");
    }
    
}
