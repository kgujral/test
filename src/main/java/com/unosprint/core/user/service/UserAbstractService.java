package com.unosprint.core.user.service;

import com.sixsprints.core.dto.MetaData;
import com.sixsprints.core.service.AbstractCrudService;
import com.unosprint.core.user.domain.User;
import com.unosprint.core.user.dto.UserExcelExportDto;
import com.unosprint.core.user.dto.UserExcelImportDto;
import com.unosprint.core.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class UserAbstractService extends AbstractCrudService<User> implements UserService {

  private final UserRepository repository;

  @Override
  protected UserRepository repository() {
    return repository;
  }

  @Override
  protected User findDuplicate(User domain) {
    return repository.findBySlug(domain.getSlug());
  }

  @Override
  protected MetaData<User> metaData() {
    return MetaData.<User>builder()
        .classType(User.class)
        .exportDataClassType(UserExcelExportDto.class)
        .importDataClassType(UserExcelImportDto.class)
        .build();
  }
}
