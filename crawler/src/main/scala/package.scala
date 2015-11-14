package org.decaf.distributed
import akka.actor.ActorSystem

package object crawler {
  lazy val CrawlerActorSystem = ActorSystem("crawler")
}
