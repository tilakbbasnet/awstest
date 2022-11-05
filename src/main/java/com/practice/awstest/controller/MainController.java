package com.practice.awstest.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/awstest")
    public ResponseEntity<?> test(){
        HttpHeaders headers =new HttpHeaders();
        headers.add("Response", "MainController");
        return new ResponseEntity<>("Tilak Basnet", headers, HttpStatus.OK);
    }

}
