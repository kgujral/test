package com.unosprint.core.role.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.role.domain.Role;
import com.unosprint.core.role.dto.RoleExcelExportDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class RoleExcelExportDtoMapper extends GenericMapper<Role, RoleExcelExportDto> {

  @Override
  public abstract Role toDomain(RoleExcelExportDto dto);

  @Override
  public abstract RoleExcelExportDto toDto(Role domain);
}
