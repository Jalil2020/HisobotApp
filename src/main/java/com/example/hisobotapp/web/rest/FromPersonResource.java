package com.example.hisobotapp.web.rest;

import com.example.hisobotapp.servis.FromPersonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FromPersonResource {
    private final FromPersonService fromPersonService;

    public FromPersonResource(FromPersonService fromPersonService) {
        this.fromPersonService = fromPersonService;
    }
}
