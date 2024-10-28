package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AppUser;
import com.example.demo.service.AppUserService;

@RestController
@ComponentScan({"com.example.demo.repository.AppUserRepository"})
public class AppUserController {
    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }
    
    @GetMapping
    public List<AppUser> listAppUsers(){
        return appUserService.list();
    }

    @PostMapping
    public AppUser createAppUser(AppUser appUser) {
        return appUserService.create(appUser);
    }
}
