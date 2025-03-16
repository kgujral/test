package com.unosprint.core.user.dto;

import lombok.Builder;
import lombok.Data;
import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UserExcelExportDto implements  Serializable {




@Excel(name="id",fixedIndex=0)

private String id ;

@Excel(name="slug",fixedIndex=1)

private String slug ;

@Excel(name="email",fixedIndex=2)

private String email ;

@Excel(name="organisationSlug",fixedIndex=3)

private String organisationSlug ;

@Excel(name="roleSlug",fixedIndex=4)

private String roleSlug ;

@Excel(name="testt",fixedIndex=5)

private String testt ;


private static final long serialVersionUID =1L;




}