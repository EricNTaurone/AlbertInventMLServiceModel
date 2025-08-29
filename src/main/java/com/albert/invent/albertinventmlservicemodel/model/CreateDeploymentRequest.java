package com.albert.invent.albertinventmlservicemodel.model;

import jakarta.annotation.Nonnull;
import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class CreateDeploymentRequest {
  @Nonnull
  Long modelId;
}
