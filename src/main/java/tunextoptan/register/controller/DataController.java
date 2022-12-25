package tunextoptan.register.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tunextoptan.register.data.repo.UserRepository;
import tunextoptan.register.dto.UserDTO;
import tunextoptan.register.service.UserService;
@Controller
@RestController
@RequestMapping("/saveuser")
@RequiredArgsConstructor
@Api(value = "Data Docs")
public class DataController {
    private final UserService userService;

    @Autowired
    private final UserRepository userRepository;



    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<UserDTO> saveUserData(@RequestBody UserDTO userDTO) {

        try {
            return ResponseEntity.ok(userService.save(userDTO));

        }catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


}
