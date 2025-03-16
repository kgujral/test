package com.unosprint.core.user.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.user.domain.User;
import com.unosprint.core.user.dto.UserExcelExportDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class UserExcelExportDtoMapper extends GenericMapper<User, UserExcelExportDto> {

  @Override
  public abstract User toDomain(UserExcelExportDto dto);

  @Override
  public abstract UserExcelExportDto toDto(User domain);
}
