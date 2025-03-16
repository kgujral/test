package com.unosprint.core.user.mapper;

import com.unosprint.core.user.domain.User;
import org.mapstruct.Mapper;
import com.unosprint.core.user.dto.UserSearchDto;
import com.sixsprints.core.transformer.GenericMapper;
import org.mapstruct.ReportingPolicy;
@Mapper(componentModel="spring",unmappedTargetPolicy=ReportingPolicy.IGNORE)
public abstract class UserSearchDtoMapper extends GenericMapper<User,UserSearchDto> {






@Override

public abstract User   toDomain(
UserSearchDto dto) ;

@Override

public abstract UserSearchDto   toDto(
User domain) ;


}