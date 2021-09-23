package com.pureintegration.controller;

import com.pureintegration.dto.ResponseDto;
import com.pureintegration.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dogs")
public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping("")
    public ResponseDto getAll(){
        System.out.println("Inside Controller");
        return dogService.getAll();
    }
}
