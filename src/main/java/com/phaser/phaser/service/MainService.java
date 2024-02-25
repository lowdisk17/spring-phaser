package com.phaser.phaser.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

import org.springframework.stereotype.Service;

import com.phaser.phaser.thread.Thread1;
import com.phaser.phaser.thread.Thread2;
import com.phaser.phaser.thread.Thread3;
import com.phaser.phaser.thread.Thread4;
import com.phaser.phaser.thread.Thread5;
import com.phaser.phaser.thread.Thread6;

@Service
public class MainService {

    private Phaser phaserAsCountDownLatch = new Phaser(3);
    private Phaser phaserAsCyclicBarrier = new Phaser(3);
    private ExecutorService es = Executors.newFixedThreadPool(3);

    public void executeProcessCountDownLatch () {

        // Phaser act similar to count down latch
        es.submit(new Thread1(phaserAsCountDownLatch));
        es.submit(new Thread2(phaserAsCountDownLatch));
        es.submit(new Thread3(phaserAsCountDownLatch));

        phaserAsCountDownLatch.awaitAdvance(1);

        System.out.println("Executed phaser as a count down latch");
    }


    public void executeProcessCyclicBarrier () {

        // Phaser act similar to cyclic barrier

        es.submit(new Thread4(phaserAsCyclicBarrier));
        es.submit(new Thread5(phaserAsCyclicBarrier));
        es.submit(new Thread6(phaserAsCyclicBarrier));

    }
    
}
