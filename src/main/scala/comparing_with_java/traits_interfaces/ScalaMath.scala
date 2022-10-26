package comparing_with_java.traits_interfaces

trait Adder{
  def add(a : Int,b : Int) : Int
}

trait Multiplier{
  def multiplier(a : Int,b : Int) : Int = a*b
}

class ScalaMath extends Adder, Multiplier {
  override def add(a: Int, b: Int): Int = a+b
}
