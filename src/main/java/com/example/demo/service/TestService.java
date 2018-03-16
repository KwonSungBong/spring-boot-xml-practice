package com.example.demo.service;

import com.example.demo.build.VastBuilder;
import com.example.demo.build.VmapBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private VastBuilder vastBuilder;

    @Autowired
    private VmapBuilder vmapBuilder;

    public void test() {

    }

}
