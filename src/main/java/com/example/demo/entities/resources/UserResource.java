package com.example.demo.entities.resources;


import com.example.demo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "Maria@gmail.com", "99999","123");
        return ResponseEntity.ok().body(u);

    }
}
