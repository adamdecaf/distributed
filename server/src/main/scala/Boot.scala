package org.decaf.distributed.server
import akka.http.scaladsl.server.Route
import org.decaf.distributed.server.aggregation.AggregationRoutes

object Boot extends App
    with HttpServer
    with AggregationRoutes {

  def routes: Route =
    aggregationRoutes()

  println("Starting 'server'")
  startHttpServer()
}
