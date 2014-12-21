package com.mangofactory.swagger.models.servicemodel.builder;

import com.mangofactory.swagger.models.servicemodel.ApiDescription;
import com.mangofactory.swagger.models.servicemodel.Operation;

import java.util.List;

public class ApiDescriptionBuilder {
  private String path;
  private String description;
  private List<Operation> operations;
  private Boolean hidden;

  public ApiDescriptionBuilder path(String path) {
    this.path = path;
    return this;
  }

  public ApiDescriptionBuilder description(String description) {
    this.description = description;
    return this;
  }

  public ApiDescriptionBuilder operations(List<Operation> operations) {
    this.operations = operations;
    return this;
  }

  public ApiDescriptionBuilder hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  public ApiDescription build() {
    return new ApiDescription(path, description, operations, hidden);
  }
}