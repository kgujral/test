package com.unosprint.core.organisation.controller;

import com.sixsprints.core.annotation.Authenticated;
import com.sixsprints.core.controller.AbstractCrudController;
import com.unosprint.core.organisation.domain.Organisation;
import com.unosprint.core.organisation.dto.OrganisationCrudDto;
import com.unosprint.core.organisation.dto.OrganisationDetailDto;
import com.unosprint.core.organisation.dto.OrganisationSearchDto;
import com.unosprint.core.organisation.mapper.OrganisationCrudDtoMapper;
import com.unosprint.core.organisation.mapper.OrganisationDetailDtoMapper;
import com.unosprint.core.organisation.mapper.OrganisationSearchDtoMapper;
import com.unosprint.core.organisation.service.OrganisationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/organisation")
@Authenticated(entity = "ORGANISATION")
public class OrganisationController
    extends AbstractCrudController<
        Organisation, OrganisationSearchDto, OrganisationDetailDto, OrganisationCrudDto> {

  public OrganisationController(
      OrganisationService organisationService,
      OrganisationSearchDtoMapper organisationSearchDtoMapper,
      OrganisationDetailDtoMapper organisationDetailDtoMapper,
      OrganisationCrudDtoMapper organisationCrudDtoMapper) {

    super(
        organisationService,
        organisationSearchDtoMapper,
        organisationDetailDtoMapper,
        organisationCrudDtoMapper);
  }
}
