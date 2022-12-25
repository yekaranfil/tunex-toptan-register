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

package tunextoptan.register.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return new User("tunex","159357",new ArrayList<>());
    }
}
