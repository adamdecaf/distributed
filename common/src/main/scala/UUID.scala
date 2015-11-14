package org.decaf.distributed.common

object UUID {
  def apply(): String =
    java.util.UUID.randomUUID().toString.toLowerCase
}
