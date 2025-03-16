package com.unosprint.core.organisation.service;

import com.unosprint.core.organisation.repository.OrganisationRepository;
import org.springframework.stereotype.Service;

@Service
public class OrganisationServiceImpl extends OrganisationAbstractService
    implements OrganisationService {

  public OrganisationServiceImpl(OrganisationRepository repository) {

    super(repository);
  }
}
