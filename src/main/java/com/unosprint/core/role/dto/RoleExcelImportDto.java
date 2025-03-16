package com.unosprint.core.role.dto;

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
public class RoleExcelImportDto extends GenericExcelImportDto {

  @Excel(name = "id", fixedIndex = 0)
  private String id;

  @Excel(name = "slug", fixedIndex = 1)
  private String slug;

  @Excel(name = "name", fixedIndex = 2)
  private String name;

  @Excel(name = "organisationSlug", fixedIndex = 3)
  private String organisationSlug;

  private static final long serialVersionUID = 1L;
}
