package com.labapiexample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {

    @GetMapping
    public ResponseEntity<Message> helloWorld() {
        return ResponseEntity.status(200).body(new Message());
    }
}
