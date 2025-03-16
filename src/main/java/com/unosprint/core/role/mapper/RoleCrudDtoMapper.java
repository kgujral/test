package com.unosprint.core.role.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.role.domain.Role;
import com.unosprint.core.role.dto.RoleCrudDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class RoleCrudDtoMapper extends GenericMapper<Role, RoleCrudDto> {

  @Override
  public abstract Role toDomain(RoleCrudDto dto);

  @Override
  public abstract RoleCrudDto toDto(Role domain);
}
