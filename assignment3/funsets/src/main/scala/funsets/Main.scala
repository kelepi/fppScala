package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
  
  val m: Set = x => x >= 1 && x <= 4              //> m  : Int => Boolean = <function1>
  forall(m, x => x < 5)   
}
