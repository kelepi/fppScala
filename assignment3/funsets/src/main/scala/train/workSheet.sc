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
  
  import funsets.FunSets._
  
  val mod2: Set = x => x % 2 == 0                 //> mod2  : Int => Boolean = <function1>
  val mod3: Set = x => x % 3 == 0                 //> mod3  : Int => Boolean = <function1>
  
  val flt = filter(mod2, mod3)                    //> flt  : Int => Boolean = <function1>
  flt(7)                                          //> res2: Boolean = false
  flt(9)                                          //> res3: Boolean = false
  flt(2)                                          //> res4: Boolean = false
  flt(6)                                          //> res5: Boolean = true
  
  val m: Set = x => x == 2 && x == 4              //> m  : Int => Boolean = <function1>
  forall(m, x => x < 5)                           //> res6: Boolean = true
  forall(m, filter(m, x => x % 2 == 0))           //> res7: Boolean = true
  exists(m, x => x % 2 == 0)                      //> res8: Boolean = true
 
 m(0)                                             //> res9: Boolean = false
 m(1)                                             //> res10: Boolean = false
 m(2)                                             //> res11: Boolean = false
 m(3)                                             //> res12: Boolean = false
 m(4)                                             //> res13: Boolean = false
 m(5)                                             //> res14: Boolean = false
 
}