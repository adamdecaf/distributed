package org.decaf.distributed.website
import akka.http.scaladsl.server.Route
import org.decaf.distributed.website.pages.PingRoute

object Boot extends App
    with HttpServer
    with PingRoute {

  def routes: Route =
    pingRoute()

  println("Starting 'website'")
  startHttpServer()
}
