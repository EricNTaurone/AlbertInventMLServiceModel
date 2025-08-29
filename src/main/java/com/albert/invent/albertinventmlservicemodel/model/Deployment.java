package com.albert.invent.albertinventmlservicemodel.model;

import java.time.Instant;

import jakarta.annotation.Nonnull;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Builder
@Value
@Jacksonized
public class Deployment {
  @Nonnull
  Long id;
  @Nonnull
  Model model;
  @Nonnull
  Instant createdAt;
  @Nonnull
  Instant updatedAt;
}
