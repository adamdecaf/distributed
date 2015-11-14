package org.decaf.distributed.server
import akka.http.scaladsl.server.Route
import org.decaf.distributed.server.aggregation.{AggregationRoutes, PingRoute}

object Boot extends App
    with HttpServer
    with AggregationRoutes
    with PingRoute {

  def routes: Route =
    pingRoute()
    // aggregationRoutes()

  println("Starting 'server'")
  startHttpServer()
}
