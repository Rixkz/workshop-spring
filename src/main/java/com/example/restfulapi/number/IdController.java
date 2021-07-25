package com.example.restfulapi.number;

import com.example.restfulapi.GeneratedIdService;
import com.example.restfulapi.user.UserGateway;
import com.example.restfulapi.user.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IdController {

    @Autowired
    private GeneratedIdService service;

    @Autowired
    private UserGateway userGateway;

    @GetMapping("/id")
    public DataResponse generateId() {
        String result = service.getId();
        return new DataResponse(result);
    }
    @GetMapping("/user")
    public UserResponse getUser() {
        UserResponse user = userGateway.getUserById(1);
        return user;
    }
}
