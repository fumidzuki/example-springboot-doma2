package com.example.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "example_one", name = "account_one")
public class AccountOne {

  @Id
  @Column
  private Integer userId;

  @Column
  private String username;

}
