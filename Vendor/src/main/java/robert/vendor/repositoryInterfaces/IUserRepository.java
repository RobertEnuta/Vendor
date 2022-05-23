package robert.vendor.repositoryInterfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import robert.vendor.models.User;

public interface IUserRepository extends JpaRepository<User, Integer> {
    User findUserByUserId(int id);

    int countUserByUserIdNotNull();

    User findByUsername(String username);

    boolean existsByEmail(String email);
}
