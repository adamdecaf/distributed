package org.decaf.distributed.server.aggregation
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._

trait PingRoute {
  def pingRoute(): Route =
    (get & path("ping")) {
      complete("PONG")
    }
}
