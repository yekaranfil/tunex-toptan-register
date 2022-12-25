package tunextoptan.register.service.Impl;

import io.jsonwebtoken.lang.Assert;
import org.apache.catalina.User;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Service;
import tunextoptan.register.data.domain.Users;
import tunextoptan.register.data.repo.UserRepository;
import tunextoptan.register.dto.UserDTO;
import tunextoptan.register.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserDTO save(UserDTO userDTO) {

        Assert.notNull(userDTO.getUserName(), "Kullanıcı Adı boş geçilemez");
        Users users = new Users();
        List<Users> userinfo = userRepository.findByUserName(userDTO.getUserName()); // verilen kullanıcı adına göre kullanıcı bilgilerini listeye gömer
        if (userinfo.size()>0){ // listenin boyutu kontrol edilir ve içinde veri varsa herhangi bir kayıt bulunmuş demektir böylece aynı kullanıcı kaydı yapılamaz.
            System.out.println("zaten böyle bir kullanıcı mevcut");

        } else { // değilse zaten kayda devam edilir.
            users.setUserId(userDTO.getUserId());
            users.setUserName(userDTO.getUserName());
            users.setUserPass(userDTO.getUserPass());
            users.setUserEmail(userDTO.getUserEmail());
            users.setUserTc(userDTO.getUserTc());
            users.setCreatedAt(userDTO.getCreatedAt());
            users.setUpdatedAt(userDTO.getUpdatedAt());

            final Users userDB = userRepository.save(users);

            userDTO.setUserId(userDB.getUserId());



        }
        return userDTO;

    }
}
