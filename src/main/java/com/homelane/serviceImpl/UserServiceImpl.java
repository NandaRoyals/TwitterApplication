package com.homelane.serviceImpl;

import com.homelane.model.Tweet;
import com.homelane.model.User;
import com.homelane.repository.TweetRepository;
import com.homelane.repository.UserRepository;
import com.homelane.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User AddUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }
    @Override
    public User UpdateUser(int id, User user) {
        User userdb = userRepository.findById(id).get();
        if(userdb!=null){
            userdb.setName(user.getName());
        }
        return userRepository.save(userdb);
    }

    @Override
    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "User Deleted";
    }
}
