package org.decaf.distributed.server.health

// check crawler, website

trait HealthChecking {
  def checkServicesHealth(): HealthCheckResult = HealthCheckResult()
}
