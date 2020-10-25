package example

import cats._, cats.data._, cats.implicits._

object Hello {
  def main(args: Array[String]) {
    val f = {(_: Int) * 3}
    val g = {(_: Int) + 1}
    val x: Either[String, Int] = Right(1)
    println((x map (f map g)) === (x map f map g))
  }
}