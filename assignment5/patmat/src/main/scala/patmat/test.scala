package patmat

/**
 * Created with IntelliJ IDEA.
 * User: yf_liu
 * Date: 14-5-19
 * Time: 下午2:54
 */

import Huffman._

object test extends App {
  // Practice 1
  val left = Leaf('A', 10)
  val right = Leaf('C', 12)
  val fork = makeCodeTree(left, right)
  println(weight(left))
  println(weight(right))
  println(weight(fork))

  println(chars(left))
  println(chars(right))
  println(chars(fork))

  // Practice 2
  val timesList = times(string2Chars("abcdeabcdabcaba"))
  println(timesList)

  val ordered = makeOrderedLeafList(timesList)
  println(ordered)

  val single = makeOrderedLeafList(times(string2Chars("a")))
  val notSingle = makeOrderedLeafList(times(string2Chars("ab")))
  println(singleton(single))
  println(singleton(notSingle))
  println(singleton(ordered))

  val cmb = combine(ordered)
  println(cmb)

  val untilA = until(singleton, combine)(ordered)
  println(untilA)

  val codeTree = createCodeTree(string2Chars("abcdeabcdabcaba"))
  println(codeTree)

  // Practice 3
  println(decodedSecret)

  val bits: List[Bit] = List(0)
  val b2 = bits.::(0).::(0).::(1).::(0)
  println(b2.reverse)

  List('a', 'b', 'c', 'd', 'e').foreach(x => println(x + " = " + find(codeTree, x, List())))

  println(encode(codeTree)(string2Chars("abcde")))

  val ct: CodeTable = List(('a', List(1, 1)), ('b', List(1, 0)), ('c', List(0, 1)), ('d', List(0, 0, 1)), ('e', List(0, 0, 0)))
  List('a', 'b', 'c', 'd', 'e').foreach(x => println(x + " = " + codeBits(ct)(x)))

  val c1: CodeTable = ct.map(x => (x._1, x._2.::(0)))
  val c2: CodeTable = ct.map(x => (x._1, x._2.::(1)))
  val cc: CodeTable = c1 ::: c2
  val cd: CodeTable = mergeCodeTables(ct, ct)
  println("ct after map = " + c1)
  println("ct after map = " + c2)
  println("ct after map = " + cc)
  println("ct after map = " + cd)

  println(convert(codeTree))
  println(convert2(codeTree))

  println(quickEncode(codeTree)(string2Chars("abcde")))
}
