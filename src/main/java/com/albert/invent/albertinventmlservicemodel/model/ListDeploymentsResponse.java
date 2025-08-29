package com.albert.invent.albertinventmlservicemodel.model;

import java.util.List;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ListDeploymentsResponse {
  List<Deployment> deployments;
}
