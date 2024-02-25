package com.phaser.phaser.controller;

import org.springframework.web.bind.annotation.RestController;

import com.phaser.phaser.service.MainService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {

    @Autowired
    private MainService service;

    @GetMapping("service/cdl")
    public String getDataCdl() {
        service.executeProcessCountDownLatch();
        return "Success";
    }

    @GetMapping("service/cb")
    public String getDataCb() {
        service.executeProcessCyclicBarrier();
        return "Success";
    }
    
    
}
