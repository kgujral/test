package com.unosprint.core.organisation.mapper;

import com.sixsprints.core.transformer.GenericMapper;
import com.unosprint.core.organisation.domain.Organisation;
import com.unosprint.core.organisation.dto.OrganisationExcelImportDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class OrganisationExcelImportDtoMapper
    extends GenericMapper<Organisation, OrganisationExcelImportDto> {

  @Override
  public abstract Organisation toDomain(OrganisationExcelImportDto dto);

  @Override
  public abstract OrganisationExcelImportDto toDto(Organisation domain);
}
