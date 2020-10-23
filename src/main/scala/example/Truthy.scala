package example

import simulacrum._

@typeclass trait CanTruthy[A] { self =>
  def truthy(a: A): Boolean
}

object CanTruthy {
  def fromTruthy[A](f: A => Boolean): CanTruthy[A] = new CanTruthy[A] {
    def truthy(a: A): Boolean = f(a)
  }

  implicit val intCanTruthy: CanTruthy[Int] = CanTruthy.fromTruthy({
    case 0 => false
    case _ => true
  })
}