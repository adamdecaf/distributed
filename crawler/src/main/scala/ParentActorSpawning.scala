package org.decaf.distributed.crawler
import akka.actor.{ActorRef, Props}

trait ParentActorSpawning {
  // CrawlerActorSystem

  def startCrawlerParent(): Unit = {
    println("Starting crawler parent")
  }

  def starWorkRequestor(): Unit = {
    println("Starting work requestor pool")
  }
}
