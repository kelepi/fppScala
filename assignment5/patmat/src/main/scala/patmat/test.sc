package patmat

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def string2Chars(str: String): List[Char] = str.toList
                                                  //> string2Chars: (str: String)List[Char]

  val chars = string2Chars("abcdeabc")            //> chars  : List[Char] = List(a, b, c, d, e, a, b, c)

  val charMap = chars.map(char => (char, 1))      //> charMap  : List[(Char, Int)] = List((a,1), (b,1), (c,1), (d,1), (e,1), (a,1)
                                                  //| , (b,1), (c,1))

}