import comparing_with_java.classes.{Person_Java, Person_Scala_V2, Person_Scala_v3}

@main
def main(): Unit = {
  val person_Scala = new Person_Scala_v3("Kushan")
  val person_Scala2 = new Person_Scala_V2("Kushan_2")
  val person_Java = new Person_Java("Kushan")
  println(s"Scala3 output is : ${person_Scala.toString}")
  println(s"Scala2 output is : ${person_Scala2.toString}")
  println(s"Java output is : ${person_Java.toString}")
}