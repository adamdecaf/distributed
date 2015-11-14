package org.decaf.distributed.server
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._
import org.decaf.distributed.server.aggregation.{AggregationRoutes, PingRoute}
import org.decaf.distributed.server.health.HealthRoute

object Boot extends App
    with HttpServer
    with AggregationRoutes
    with HealthRoute
    with PingRoute {

  def routes: Route =
    pingRoute() ~
    healthRoute()
    // aggregationRoutes()

  println("Starting 'server'")
  startHttpServer()
}
