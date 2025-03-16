package com.unosprint.core.organisation.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.organisation.domain.Organisation;
import com.unosprint.core.organisation.dto.OrganisationDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class OrganisationDetailDtoMapper
    extends GenericMapper<Organisation, OrganisationDetailDto> {

  @Override
  public abstract Organisation toDomain(OrganisationDetailDto dto);

  @Override
  public abstract OrganisationDetailDto toDto(Organisation domain);
}
