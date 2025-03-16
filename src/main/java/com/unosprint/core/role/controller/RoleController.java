package com.unosprint.core.role.controller;

import com.sixsprints.core.annotation.Authenticated;
import com.sixsprints.core.controller.AbstractCrudController;
import com.unosprint.core.role.domain.Role;
import com.unosprint.core.role.dto.RoleCrudDto;
import com.unosprint.core.role.dto.RoleDetailDto;
import com.unosprint.core.role.dto.RoleSearchDto;
import com.unosprint.core.role.mapper.RoleCrudDtoMapper;
import com.unosprint.core.role.mapper.RoleDetailDtoMapper;
import com.unosprint.core.role.mapper.RoleSearchDtoMapper;
import com.unosprint.core.role.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/role")
@Authenticated(entity = "ROLE")
public class RoleController
    extends AbstractCrudController<Role, RoleSearchDto, RoleDetailDto, RoleCrudDto> {

  public RoleController(
      RoleService roleService,
      RoleSearchDtoMapper roleSearchDtoMapper,
      RoleDetailDtoMapper roleDetailDtoMapper,
      RoleCrudDtoMapper roleCrudDtoMapper) {

    super(roleService, roleSearchDtoMapper, roleDetailDtoMapper, roleCrudDtoMapper);
  }
}
