object collections extends App {

  val d = List(5, 6, 7, 8)
  println(d)

  val f = Set(3, 6, 9, 12)
  println(f)

  val g = Map("a" -> 1, "b" -> 2, "c" -> 3)
  println(g)
  println(g("c"))

  val t = ("Car", 5)
  println(t)

  val k: Option[String] = Some("Y")
  println(k)

}
