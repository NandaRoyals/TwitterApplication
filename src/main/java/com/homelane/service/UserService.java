package com.homelane.service;



import com.homelane.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public User AddUser(User user);
    List<User> getUser();
    public User UpdateUser(int id, User user);
    public String deleteUser(int id);
}
