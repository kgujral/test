package com.unosprint.core.user.service;

import com.unosprint.core.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends UserAbstractService implements UserService {

  public UserServiceImpl(UserRepository repository) {

    super(repository);
  }
}
