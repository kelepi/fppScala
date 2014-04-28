package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BalanceSuite extends FunSuite {
  import Main.balance

  test("balance: '(if (zero? x) max (/ 1 x))' is balanced") {
    assert(balance("(if (zero? x) max (/ 1 x))".toList))
  }

  test("balance: 'I told him ...' is balanced") {
    assert(balance("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList))
  }

  test("balance: ':-)' is unbalanced") {
    assert(!balance(":-)".toList))
  }

  test("balance: counting is not enough") {
    assert(!balance("())(".toList))
  }
  
  test("balance: empty list") {
    assert(balance("".toList))
  }
  
  test("balance: all left parenthesis") {
    assert(!balance(" (((".toList))
  }
  
  test("balance: all right parenthesis") {
    assert(!balance(" ) ))".toList))
  }
  
  test("balance: words without parenthesis") {
    assert(!balance(" ax kdu o23 !@#".toList))
  }
  
  test("balance: 1 (") {
    assert(!balance("(".toList))
  }
  
  test("balance: 1 )") {
    assert(!balance(")".toList))
  }

  test("balance: corner case") {
    assert(balance("(asdf(asaff)((dsfa ((awer (afa()) sdf)))c va))".toList))
  }
  
  test("balance: 1") {
    assert(!balance(" ) )".toList))
  }
  
  test("balance: 11") {
    assert(!balance(" ( (".toList))
  }
  
  test("balance: 111") {
    assert(balance(" ( ) ()".toList))
  }
  
  test("balance: 1111") {
    assert(balance(" ( () )".toList))
  }
  
  test("balance: 11111") {
    assert(!balance(" ()((".toList))
  }

}
