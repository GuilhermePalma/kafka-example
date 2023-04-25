package com.guilhermepalma.producer_example.endpoints;

import com.guilhermepalma.producer_example.model.User;
import com.guilhermepalma.producer_example.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/user/v1")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        String id = null;
        try {
            id = userService.createUser(user);
            return ResponseEntity.ok(id);
        } catch (Exception ex) {
            return ResponseEntity.internalServerError().body("Internal error. ID: " + ex);
        }
    }


}
