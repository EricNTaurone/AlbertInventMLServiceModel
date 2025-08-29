package com.albert.invent.albertinventmlservicemodel.model;

import java.util.List;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Builder
@Value
@Jacksonized
public class ListModelsResponse {
  List<Model> models;
}
