package com.albert.invent.albertinventmlservicemodel.model;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Builder
@Value
@Jacksonized
public class DeleteDeploymentRequest {
  @NonNull
  Long deploymentId;
}
