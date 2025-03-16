package com.unosprint.core.organisation.service;

import com.sixsprints.core.dto.MetaData;
import com.sixsprints.core.service.AbstractCrudService;
import com.unosprint.core.organisation.domain.Organisation;
import com.unosprint.core.organisation.dto.OrganisationExcelExportDto;
import com.unosprint.core.organisation.dto.OrganisationExcelImportDto;
import com.unosprint.core.organisation.repository.OrganisationRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class OrganisationAbstractService extends AbstractCrudService<Organisation>
    implements OrganisationService {

  private final OrganisationRepository repository;

  @Override
  protected OrganisationRepository repository() {
    return repository;
  }

  @Override
  protected Organisation findDuplicate(Organisation domain) {
    return repository.findBySlug(domain.getSlug());
  }

  @Override
  protected MetaData<Organisation> metaData() {
    return MetaData.<Organisation>builder()
        .classType(Organisation.class)
        .exportDataClassType(OrganisationExcelExportDto.class)
        .importDataClassType(OrganisationExcelImportDto.class)
        .build();
  }
}
