package com.example.nftindexer_backendspring;

import com.example.nftindexer_backendspring.service.Indexer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Async implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(Indexer.class);
    @Override
    public void run(String... args) throws Exception {

    }
}
