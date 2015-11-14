package org.decaf.distributed
import akka.actor.ActorSystem

package object server {
  lazy val ServerActorSystem = ActorSystem("server")
}
