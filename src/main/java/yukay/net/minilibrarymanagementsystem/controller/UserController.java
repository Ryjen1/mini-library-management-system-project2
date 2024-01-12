package yukay.net.minilibrarymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yukay.net.minilibrarymanagementsystem.entity.User;
import yukay.net.minilibrarymanagementsystem.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mini-library/users")

public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add-user")
    public String addUser(@RequestBody User user){
        User adduser = userService.addUser(user);
        return "User added Successfully";
    }
    @DeleteMapping("/delete-user")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
    @GetMapping("/search/{id}")
    public Optional<User> searchUser(@PathVariable Long id){
        return userService.searchUser(id);
    }
    @GetMapping("all-users")
    public List<User> allUser(){
        return userService.allUser();
    }
}
