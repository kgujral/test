package com.unosprint.core.role.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.role.domain.Role;
import com.unosprint.core.role.dto.RoleDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class RoleDetailDtoMapper extends GenericMapper<Role, RoleDetailDto> {

  @Override
  public abstract Role toDomain(RoleDetailDto dto);

  @Override
  public abstract RoleDetailDto toDto(Role domain);
}
