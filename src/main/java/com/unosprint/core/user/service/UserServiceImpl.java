package com.unosprint.core.user.service;

import org.springframework.stereotype.Service;
import com.unosprint.core.user.repository.UserRepository;
@Service
public class UserServiceImpl extends UserAbstractService implements  UserService {







public UserServiceImpl(
UserRepository repository){

    super(repository


            )


; 


}


}