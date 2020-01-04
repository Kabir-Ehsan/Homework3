package com.example.homework3.ProfileRepository;

import com.example.homework3.model.Address;
import com.example.homework3.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileRepository {

    public User getProfile(){
        User user = new User( "Ehsan", "Address", 28,  "111000");
        return user;
    }
}
