package com.unosprint.core.user.dto;

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
public class UserDetailDto extends GenericEntityDto {

  private String id;

  private String slug;

  private String email;

  private String organisationSlug;

  private String roleSlug;

  private String testt;

  private static final long serialVersionUID = 1L;
}
