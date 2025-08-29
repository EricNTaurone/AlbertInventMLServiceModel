package com.albert.invent.albertinventmlservicemodel.model;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class PerformDeploymentInferenceRequest {

  Long deploymentId;
  String inference;
}
