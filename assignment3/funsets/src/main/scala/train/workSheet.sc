package train

object workSheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  type Set = Int => Boolean

  def singletonSet(elem: Int): Set = _ == elem    //> singletonSet: (elem: Int)Int => Boolean
  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: Int => Boolean, elem: Int)Boolean
  val sgtSet = singletonSet(10)                   //> sgtSet  : Int => Boolean = <function1>

  contains(sgtSet, 5)                             //> res0: Boolean = false
  contains(sgtSet, 10)                            //> res1: Boolean = true
}