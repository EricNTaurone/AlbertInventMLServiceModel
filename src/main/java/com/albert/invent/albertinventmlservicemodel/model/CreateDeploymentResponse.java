package com.albert.invent.albertinventmlservicemodel.model;

import jakarta.annotation.Nonnull;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class CreateDeploymentResponse {
  @Nonnull
  Long deploymentId;
  @Nonnull
  Long modelId;
  @Nonnull
  Long modelVersion;
}
