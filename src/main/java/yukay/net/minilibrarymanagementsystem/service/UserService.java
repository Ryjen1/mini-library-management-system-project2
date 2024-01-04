package yukay.net.minilibrarymanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yukay.net.minilibrarymanagementsystem.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
}
