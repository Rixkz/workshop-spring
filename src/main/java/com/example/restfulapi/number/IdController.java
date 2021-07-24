package com.example.restfulapi.number;

import com.example.restfulapi.GeneratedIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdController {
    @Autowired
    private GeneratedIdService service;
    @GetMapping("/id")
    public DataResponse generateId() {
        String result = service.getId();
        return new DataResponse(result);
    }
}
