package com.unosprint.core.role.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.role.domain.Role;
import com.unosprint.core.role.dto.RoleExcelImportDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class RoleExcelImportDtoMapper extends GenericMapper<Role, RoleExcelImportDto> {

  @Override
  public abstract Role toDomain(RoleExcelImportDto dto);

  @Override
  public abstract RoleExcelImportDto toDto(Role domain);
}
