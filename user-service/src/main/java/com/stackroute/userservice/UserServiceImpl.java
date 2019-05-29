package com.stackroute.userservice;

import com.stackroute.domain.User;
import com.stackroute.exceptions.UserAlreadyExistsException;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) throws UserAlreadyExistsException {
        if(userRepository.existsById(user.getId())) {
            throw new UserAlreadyExistsException("User Already Exists...");
        }

        User saveUser= userRepository.save(user);
        return saveUser;
    }


//    @Override
//    public List<User> findByName(String name) {
//
//        return userRepository.findByName(name);
//    }


    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll() ;
    }
}
