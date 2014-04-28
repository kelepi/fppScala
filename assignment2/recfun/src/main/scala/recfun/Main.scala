package recfun
import common._

object Main {
  def main(args: Array[String]) {
    //    println("Pascal's Triangle")
    //    for (row <- 0 to 10) {
    //      for (col <- 0 to row)
    //        print(pascal(col, row) + " ")
    //      println()
    //    }

        println("Balance")
        println("(if (zero? x) max (/ 1 x))")
        println(balance("(i(z)m(1))".toList))
    
    //    println("I told him (that it's not (yet) done).\n(But he wasn't listening)")
    //    println(balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList))
    //
    //    println("abcde")
    //    println(balance("abcde".toList))

    //    println("Counting Change")
    //    println(countChange(100, List(800, 10, 20, 50)))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else {
      pascal(c - 1, r - 1) + pascal(c, r - 1)
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = { 
    def balanceByTailRec(chars: List[Char], x: Int): Boolean = {
         chars match {
           case (Nil) => x == 0
           case ('('::tail) => if( x == -1) balanceByTailRec(chars.tail, 1) else balanceByTailRec(chars.tail, x + 1) 
           case (')'::tail) => balanceByTailRec(chars.tail, x - 1)
           case (_::tail) => balanceByTailRec(chars.tail, x)
         }
      }  


def isBalance(chars: List[Char], left: Int): Boolean = {
      if (!chars.isEmpty) {
        val head = chars.head
        val numLeft = if (head == '(') {
          if (left == -1) 1
          else left + 1
        } else if (head == ')') left - 1
        else left
        isBalance(chars.tail, numLeft)
      } else left == 0
    }

def balanceByFold(chars: List[Char]): Boolean =
      chars.foldLeft(-1) {
        case (-1, ')') => return false
        case (0, ')') => return false
        case (x, ')') => x - 1
        case (-1, '(') => 1
        case (x, '(') => x + 1
        case (x, _) => x
      } == 0 && !chars.isEmpty


      
    //    isBalance(chars, -1)
//    balanceByFold(chars)
      if(chars.isEmpty) true else balanceByTailRec(chars, -1)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money < 0) 0
    else if (coins.isEmpty) 0
    else {
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
  }
}
