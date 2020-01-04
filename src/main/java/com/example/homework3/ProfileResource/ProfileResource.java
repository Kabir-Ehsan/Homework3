package com.example.homework3.ProfileResource;

import com.example.homework3.ProfileService.ProfileService;
import com.example.homework3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/users")

public class ProfileResource {

        @Autowired
        private ProfileService Serv;

        @GetMapping("/hello")
        public User getProfile(){
            return Serv.getProfile();
        }
    }
