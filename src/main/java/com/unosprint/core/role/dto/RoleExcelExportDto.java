package com.unosprint.core.role.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class RoleExcelExportDto implements Serializable {

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
