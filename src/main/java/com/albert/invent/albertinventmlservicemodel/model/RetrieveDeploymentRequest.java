package com.albert.invent.albertinventmlservicemodel.model;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Builder
@Value
@Jacksonized
public class RetrieveDeploymentRequest {
  Long deploymentId;
}
