package com.unosprint.core.organisation.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.organisation.domain.Organisation;
import com.unosprint.core.organisation.dto.OrganisationSearchDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class OrganisationSearchDtoMapper
    extends GenericMapper<Organisation, OrganisationSearchDto> {

  @Override
  public abstract Organisation toDomain(OrganisationSearchDto dto);

  @Override
  public abstract OrganisationSearchDto toDto(Organisation domain);
}
