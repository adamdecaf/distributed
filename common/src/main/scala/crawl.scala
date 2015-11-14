package org.decaf.distributed.common

case class CrawlRequest(
  username: String,
  password: String
) extends WireMessage

object CrawlRequest {
  def create: CrawlRequest =
    CrawlRequest(
      username = Random.randomString(),
      password = Random.randomString()
    )
}
