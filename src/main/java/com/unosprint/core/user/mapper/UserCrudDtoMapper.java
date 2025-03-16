package com.unosprint.core.user.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.user.domain.User;
import com.unosprint.core.user.dto.UserCrudDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class UserCrudDtoMapper extends GenericMapper<User, UserCrudDto> {

  @Override
  public abstract User toDomain(UserCrudDto dto);

  @Override
  public abstract UserCrudDto toDto(User domain);
}
