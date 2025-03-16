package com.unosprint.core.user.mapper;

import com.unosprint.core.user.domain.User;
import com.unosprint.core.user.dto.UserExcelImportDto;
import org.mapstruct.Mapper;
import com.sixsprints.core.transformer.GenericMapper;
import org.mapstruct.ReportingPolicy;
@Mapper(componentModel="spring",unmappedTargetPolicy=ReportingPolicy.IGNORE)
public abstract class UserExcelImportDtoMapper extends GenericMapper<User,UserExcelImportDto> {






@Override

public abstract User   toDomain(
UserExcelImportDto dto) ;

@Override

public abstract UserExcelImportDto   toDto(
User domain) ;


}