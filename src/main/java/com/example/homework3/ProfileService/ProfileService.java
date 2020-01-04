package com.example.homework3.ProfileService;

import com.example.homework3.ProfileRepository.ProfileRepository;
import com.example.homework3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    ProfileRepository repo;

    public User getProfile()
    {
        return repo.getProfile();
    }
}
