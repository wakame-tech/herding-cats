import cats._, cats.data._, cats.implicits._

sealed trait TrafficLight
object TrafficLight {
  def red: TrafficLight = Red
  def yellow: TrafficLight = Yellow
  def green: TrafficLight = Green

  case object Red extends TrafficLight
  case object Yellow extends TrafficLight
  case object Green extends TrafficLight

  implicit val trafficLightEq: Eq[TrafficLight] = new Eq[TrafficLight] {
    def eqv(a1: TrafficLight, a2: TrafficLight): Boolean = a1 == a2
  }
}