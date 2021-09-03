object matchExpressions extends App {

  val paramList = Array("first", "second", "third")
  val item = if (!paramList.isEmpty) paramList(0) else "Default value"
  println(item)

  val choice = item match {
    case "first" => "first selected"
    case "second" => "second selected"
    case "third" => "third selected"
    case _ => "something else selected"
  }

  println(choice)

}
