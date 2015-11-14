package org.decaf.distributed.common
import akka.actor.ActorRef

case class HealthPing(
  listener: ActorRef
) extends WireMessage

case class HealthPong(
  isHealthy: Boolean,
  message: Option[String] = None
) extends WireMessage
