package com.example.nftindexer_backendspring.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexerController {

    @GetMapping("/version")
    public Map<String, String> test(){
        HashMap<String, String> hm = new HashMap<>();
        hm.put("version", "0.1.0");
        return hm;
    }
}
