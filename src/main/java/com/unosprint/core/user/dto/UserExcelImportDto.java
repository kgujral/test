package com.unosprint.core.user.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.sixsprints.core.dto.GenericExcelImportDto;
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
public class UserExcelImportDto extends GenericExcelImportDto {

  @Excel(name = "id", fixedIndex = 0)
  private String id;

  @Excel(name = "slug", fixedIndex = 1)
  private String slug;

  @Excel(name = "email", fixedIndex = 2)
  private String email;

  @Excel(name = "organisationSlug", fixedIndex = 3)
  private String organisationSlug;

  @Excel(name = "roleSlug", fixedIndex = 4)
  private String roleSlug;

  @Excel(name = "testt", fixedIndex = 5)
  private String testt;

  private static final long serialVersionUID = 1L;
}
