package org.decaf.distributed.server.health

case class HealthCheckResult(
  errors: List[String] = List.empty
) {
  lazy val allServicesHealthy = errors.isEmpty
}
