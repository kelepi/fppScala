package forcomp

import Anagrams._

object test {
  val prefix = wordOccurrences("")                //> prefix  : forcomp.Anagrams.Occurrences = List()
  val total = wordOccurrences("abcda")            //> total  : forcomp.Anagrams.Occurrences = List((a,2), (b,1), (c,1), (d,1))
  
  val next = nextPrefix(prefix, total)            //> java.util.NoSuchElementException: head of empty list
                                                  //| 	at scala.collection.immutable.Nil$.head(List.scala:337)
                                                  //| 	at scala.collection.immutable.Nil$.head(List.scala:334)
                                                  //| 	at forcomp.Anagrams$.nextPrefix(Anagrams.scala:196)
                                                  //| 	at forcomp.test$$anonfun$main$1.apply$mcV$sp(forcomp.test.scala:9)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at forcomp.test$.main(forcomp.test.scala:5)
                                                  //| 	at forcomp.test.main(forcomp.test.scala)
  val n2 = nextPrefix(next,total)
  
  
  
}