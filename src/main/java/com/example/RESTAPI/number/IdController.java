package com.example.RESTAPI.number;

import com.example.RESTAPI.GenerateIdService;
import com.example.RESTAPI.user.UserGateway;
import com.example.RESTAPI.user.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdController {

    @Autowired
    private GenerateIdService service;

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
