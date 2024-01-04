package yukay.net.minilibrarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yukay.net.minilibrarymanagementsystem.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
