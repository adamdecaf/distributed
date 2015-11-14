package org.decaf.distributed.common
import scala.util.{Random => ScalaRandom}

object Random {
  // 5, 15 -> (10) + (0, 5] == (10, 15]
  def randomInt(min: Int, max: Int): Int =
    (max - min) + ScalaRandom.nextInt(min)

  def randomString(length: Int = randomInt(5, 15)): String =
    ScalaRandom.alphanumeric.take(length).mkString("")
}
