package example

import Lists._

object Main extends App {
  assert(max(List(1, 2, 3, -1, -2, 1000)) == 1000)
  assert(sum(List(1, 2, 3, -1, -2, 1000)) == 1003)
  try {
    println(max(List()))
  } catch {
    case ex: NoSuchElementException => println("NoSuchElementException occured")
  }
}