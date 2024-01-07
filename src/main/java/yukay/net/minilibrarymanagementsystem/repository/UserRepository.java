package yukay.net.minilibrarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import yukay.net.minilibrarymanagementsystem.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
