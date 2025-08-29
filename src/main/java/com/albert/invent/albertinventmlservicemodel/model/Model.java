package com.albert.invent.albertinventmlservicemodel.model;

import java.time.Instant;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Builder
@Value
@Jacksonized
public class Model {
  Long id;
  String name;
  Long version;
  String description;
  Instant createdAt;
  Instant updatedAt;
}
