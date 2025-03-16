package com.unosprint.core.organisation.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.organisation.domain.Organisation;
import com.unosprint.core.organisation.dto.OrganisationCrudDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class OrganisationCrudDtoMapper
    extends GenericMapper<Organisation, OrganisationCrudDto> {

  @Override
  public abstract Organisation toDomain(OrganisationCrudDto dto);

  @Override
  public abstract OrganisationCrudDto toDto(Organisation domain);
}
