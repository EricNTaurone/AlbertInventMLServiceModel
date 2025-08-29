package com.albert.invent.albertinventmlservicemodel.model;

import jakarta.annotation.Nonnull;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Builder
@Value
@Jacksonized
public class CreateDeploymentRequest {
  @Nonnull
  Long modelId;
}
