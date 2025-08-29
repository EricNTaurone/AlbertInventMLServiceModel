package com.albert.invent.albertinventmlservicemodel.model;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Builder
@Value
public class DeleteDeploymentRequest {
  @NonNull
  Long deploymentId;
}
