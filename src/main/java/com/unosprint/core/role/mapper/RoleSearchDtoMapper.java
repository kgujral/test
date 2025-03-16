package com.unosprint.core.role.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.role.domain.Role;
import com.unosprint.core.role.dto.RoleSearchDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class RoleSearchDtoMapper extends GenericMapper<Role, RoleSearchDto> {

  @Override
  public abstract Role toDomain(RoleSearchDto dto);

  @Override
  public abstract RoleSearchDto toDto(Role domain);
}
