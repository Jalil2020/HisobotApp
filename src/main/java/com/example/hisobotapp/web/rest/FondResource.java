package com.example.hisobotapp.web.rest;

import com.example.hisobotapp.servis.FondService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FondResource {

    private final FondService fondService;

    public FondResource(FondService fondService) {
        this.fondService = fondService;
    }
}
