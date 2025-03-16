package com.unosprint.core.user.domain;

import com.sixsprints.core.domain.AbstractMongoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractMongoEntity {

  @Indexed(unique = true)
  private String id;

  @Indexed(unique = true)
  private String slug;

  @Indexed(unique = true)
  private String email;

  private String organisationSlug;

  private String roleSlug;

  private String testt;

  private static final long serialVersionUID = 1L;
}
