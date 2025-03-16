package com.unosprint.core.role.service;

import com.sixsprints.core.dto.MetaData;
import com.sixsprints.core.service.AbstractCrudService;
import com.unosprint.core.role.domain.Role;
import com.unosprint.core.role.dto.RoleExcelExportDto;
import com.unosprint.core.role.dto.RoleExcelImportDto;
import com.unosprint.core.role.repository.RoleRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class RoleAbstractService extends AbstractCrudService<Role> implements RoleService {

  private final RoleRepository repository;

  @Override
  protected RoleRepository repository() {
    return repository;
  }

  @Override
  protected Role findDuplicate(Role domain) {
    return repository.findBySlug(domain.getSlug());
  }

  @Override
  protected MetaData<Role> metaData() {
    return MetaData.<Role>builder()
        .classType(Role.class)
        .exportDataClassType(RoleExcelExportDto.class)
        .importDataClassType(RoleExcelImportDto.class)
        .build();
  }
}
