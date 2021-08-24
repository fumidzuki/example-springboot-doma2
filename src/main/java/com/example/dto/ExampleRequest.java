package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExampleRequest {

  private String name;

  @JsonProperty("oreder_no")
  private String orederNo;

}
