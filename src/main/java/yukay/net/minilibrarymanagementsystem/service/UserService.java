package yukay.net.minilibrarymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import yukay.net.minilibrarymanagementsystem.entity.User;
import yukay.net.minilibrarymanagementsystem.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
    @CacheEvict(value = "users",key = "#id")
    public void deleteUser(Long id) {

        userRepository.deleteById(id);
    }
    @Cacheable(value = "users",key = "id")
    public Optional<User> searchUser(Long id) {
        return userRepository.findById(id);
    }

    public List<User> allUser() {

        return  userRepository.findAll();
    }
}
