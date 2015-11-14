package org.decaf.distributed
import akka.actor.ActorSystem

package object website {
  lazy val WebsiteActorSystem = ActorSystem("website")
}
