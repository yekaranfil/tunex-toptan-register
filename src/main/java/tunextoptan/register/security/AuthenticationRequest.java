/*
 *
 *
 *  *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *  *
 *  *  Copyright (C) 2022 Terra Yazılım Ltd Şti - All Rights Reserved
 *  *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  *  Proprietary and confidential.
 *  *
 *  *  Written by Yusuf Emre Karanfil  <yekaranfil@terrayazilim.com.tr>, September 2022
 *
 */

package tunextoptan.register.security;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable {
    private String username;
    private String password;




    public AuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
