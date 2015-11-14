package org.decaf.distributed.server.health
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.model.StatusCodes

trait HealthRoute extends HealthChecking {
  def healthRoute(): Route =
    (get & path("health")) {
      val result = checkServicesHealth()
      if (result.allServicesHealthy) {
        complete(StatusCodes.NoContent)
      } else {
        complete(StatusCodes.InternalServerError)
      }
    }
}
