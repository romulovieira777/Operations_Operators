object javaTypesInScala extends App {

  val s = "Some text"
  print(s)

  val f = 5
  println(f)

  def test(a: Int, b: Int) = a == b
  println(test(100, 100))

  def newTest(a: Any, b: Any) = a == b
  println(newTest(100, 100))

}
