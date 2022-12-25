package tunextoptan.register.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Repository;
import tunextoptan.register.dto.UserDTO;

@Repository
public interface UserService {

    UserDTO save(UserDTO userDTO) throws JsonProcessingException;

}
