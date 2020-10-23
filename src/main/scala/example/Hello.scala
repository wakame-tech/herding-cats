package example
import Monoid.ops._

object Hello {
  def sum[M[_]: FoldLeft, A: Monoid](xs: M[A])(implicit m: Monoid[A], fl: FoldLeft[M]): A = fl.foldLeft(xs, m.mzero, m.mappend)

  def main(args: Array[String]) {
    println(3 |+| 4)
    println("a" |+| "b")
    println(sum(List(1, 2, 3)))
  }
}