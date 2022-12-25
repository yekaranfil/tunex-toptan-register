package tunextoptan.register.dto;


import lombok.*;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO implements Serializable {
    Calendar calendar = Calendar.getInstance();

    private Integer userId;
    private String userName;
    private String userPass;
    private String userTc;
    private String userEmail;
    private Date createdAt = calendar.getTime();
    private Date updatedAt = calendar.getTime();

}
