package com.example.hisobotapp.web.rest;

import com.example.hisobotapp.domain.Income;
import com.example.hisobotapp.domain.Users;
import com.example.hisobotapp.servis.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersResource {
    private final UsersService usersService;

    public UsersResource(UsersService usersService) {
        this.usersService = usersService;
    }

    @CrossOrigin
    @GetMapping("/users")
    public ResponseEntity getAll() {
        List<Users> list = usersService.getAll();
        return ResponseEntity.ok(list);
    }
}
