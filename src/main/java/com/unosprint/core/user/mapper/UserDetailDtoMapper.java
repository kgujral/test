package com.unosprint.core.user.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.user.domain.User;
import com.unosprint.core.user.dto.UserDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class UserDetailDtoMapper extends GenericMapper<User, UserDetailDto> {

  @Override
  public abstract User toDomain(UserDetailDto dto);

  @Override
  public abstract UserDetailDto toDto(User domain);
}
