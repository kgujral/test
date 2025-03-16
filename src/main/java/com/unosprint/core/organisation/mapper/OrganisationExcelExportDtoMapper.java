package com.unosprint.core.organisation.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.organisation.domain.Organisation;
import com.unosprint.core.organisation.dto.OrganisationExcelExportDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class OrganisationExcelExportDtoMapper
    extends GenericMapper<Organisation, OrganisationExcelExportDto> {

  @Override
  public abstract Organisation toDomain(OrganisationExcelExportDto dto);

  @Override
  public abstract OrganisationExcelExportDto toDto(Organisation domain);
}
