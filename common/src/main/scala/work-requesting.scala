package org.decaf.distributed.common

case class WorkRequest(
  count: Int
) extends WireMessage

case class BatchOfWork(
  requests: List[CrawlRequest]
) extends WireMessage
