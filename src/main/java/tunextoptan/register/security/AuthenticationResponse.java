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

public class AuthenticationResponse implements Serializable {
    private final  String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt()   {
        return jwt;
    }
}
