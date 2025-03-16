package com.unosprint.core.role.service;

import com.unosprint.core.role.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends RoleAbstractService implements RoleService {

  public RoleServiceImpl(RoleRepository repository) {

    super(repository);
  }
}
