package train

object workSheet {
  import funsets.FunSets._

  val gtZeroltTen: Set = x => x > 0 && x < 10     //> gtZeroltTen  : Int => Boolean = <function1>
  val gtOneltThirteen: Set = x => x > 1 && x < 13 //> gtOneltThirteen  : Int => Boolean = <function1>

  val sgt = singletonSet(5)                       //> sgt  : Int => Boolean = <function1>

  printSet(sgt)                                   //> {5}
  printSet(gtZeroltTen)                           //> {1,2,3,4,5,6,7,8,9}
  printSet(gtOneltThirteen)                       //> {2,3,4,5,6,7,8,9,10,11,12}

  val uni = union(gtZeroltTen, gtOneltThirteen)   //> uni  : Int => Boolean = <function1>
  printSet(uni)                                   //> {1,2,3,4,5,6,7,8,9,10,11,12}

  val dif = diff(gtZeroltTen, gtOneltThirteen)    //> dif  : Int => Boolean = <function1>
  printSet(dif)                                   //> {1}

  val inter = intersect(gtZeroltTen, gtOneltThirteen)
                                                  //> inter  : Int => Boolean = <function1>
  printSet(inter)                                 //> {2,3,4,5,6,7,8,9}

  val filt = filter(uni, x => x % 3 == 0)         //> filt  : Int => Boolean = <function1>
  printSet(uni)                                   //> {1,2,3,4,5,6,7,8,9,10,11,12}
  printSet(filt)                                  //> {3,6,9,12}

  val filtInter = intersect(uni, x => x % 3 == 0) //> filtInter  : Int => Boolean = <function1>
  printSet(uni)                                   //> {1,2,3,4,5,6,7,8,9,10,11,12}
  printSet(filtInter)                             //> {3,6,9,12}

  contains(uni, 0)                                //> res0: Boolean = false
  contains(uni, 1)                                //> res1: Boolean = true
  contains(uni, 12)                               //> res2: Boolean = true
  contains(uni, 13)                               //> res3: Boolean = false

  forall(uni, x => x > 0)                         //> res4: Boolean = true
  forall(uni, x => x > 1)                         //> res5: Boolean = false
  forall(uni, x => x % 2 == 0)                    //> res6: Boolean = false
  forall(uni, x => x < 12)                        //> res7: Boolean = false
  forall(uni, x => x < 13)                        //> res8: Boolean = true

  forall(filt, x => x % 3 == 0)                   //> res9: Boolean = true
  forall(filt, x => x % 2 == 0)                   //> res10: Boolean = false

  printSet(uni)                                   //> {1,2,3,4,5,6,7,8,9,10,11,12}
  exists(uni, x => x % 2 != 0)                    //> res11: Boolean = true
  exists(uni, x => x > 13)                        //> res12: Boolean = false
  exists(uni, x => x < 3)                         //> res13: Boolean = true

  exists(filt, x => x % 6 == 0)                   //> res14: Boolean = true
  exists(filt, x => x % 7 == 0)                   //> res15: Boolean = false
  exists(filt, x => x > 8 && x < 10)              //> res16: Boolean = true
  
  exists(filter(uni, x => x < 7), x => x % 3 == 0)//> res17: Boolean = true

  val mp = map(uni, x => x * 2)                   //> mp  : Int => Boolean = <function1>
  printSet(uni)                                   //> {1,2,3,4,5,6,7,8,9,10,11,12}
  printSet(mp)                                    //> {2,4,6,8,10,12,14,16,18,20,22,24}
  
  val la = Array()                                //> la  : Array[Nothing] = Array()
  val lb = Array(2, 4, 5)                         //> lb  : Array[Int] = Array(2, 4, 5)
  
  print(la)                                       //> [Ljava.lang.Object;@19f21412
  print(lb)                                       //> [I@6403b70c
  
  la == lb                                        //> res18: Boolean = false
  la eq lb                                        //> res19: Boolean = false
}