package org.decaf.distributed.website.pages
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._

trait PingRoute {
  def pingRoute(): Route =
    (get & path("ping")) {
      complete("PONG")
    }
}
