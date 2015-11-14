package org.decaf.distributed.crawler

object Boot extends App
  with ParentActorSpawning {
  println("crawler is starting")
  startCrawlerParent()
  starWorkRequestor()
}
