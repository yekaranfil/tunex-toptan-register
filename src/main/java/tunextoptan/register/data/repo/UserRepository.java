package tunextoptan.register.data.repo;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import tunextoptan.register.data.domain.Users;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<Users, Integer> {


     List<Users> findByUserName(String userName);


}
