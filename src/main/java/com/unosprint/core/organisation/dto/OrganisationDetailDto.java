package com.unosprint.core.organisation.dto;

import com.sixsprints.core.dto.GenericEntityDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class OrganisationDetailDto extends GenericEntityDto {

  private String id;

  private String slug;

  private String name;

  private static final long serialVersionUID = 1L;
}
