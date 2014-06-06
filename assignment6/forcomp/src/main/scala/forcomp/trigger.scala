package forcomp


import Anagrams._
object trigger extends App {
  val prefix = wordOccurrences("")               
  val total = wordOccurrences("abcda")            
  
  println(prefix)
  println(total)
  
  var next = nextPrefix(prefix, total)
  println(next)
  while(next != nextPrefix(next, total)) {
    
    next = nextPrefix(next, total)
    println(next)
  }
}