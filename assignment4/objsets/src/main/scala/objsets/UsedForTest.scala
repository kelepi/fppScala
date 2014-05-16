package objsets

object UsedForTest extends App {
  // Test class setter & getter
  val t1 = new Tweet("Patrick", "YUfan", 11)
  //	print(t1.user)
  //	print(t1.text)
  //	print(t1.retweets)

  // Test zip function
  val name = List("Apple", "Banana", "Watermelon")
  val price = List(3.34, 4.67, 9.90)
  val namePrice: Map[String, Double] = Map() ++ (name zip price)
  //	println(namePrice)
  //	println(namePrice.get("Apple").get)

  // Test map function
  val newName = name.map(x => x + " From USA")
  //	println(newName)

  // Test pre traverse a TweetSet
  val gizmodoTweets = TweetReader.ParseTweets.getTweetData("gizmodo", TweetData.gizmodo)
  val gizmodoTweetsSet = TweetReader.toTweetSet(gizmodoTweets)
  //	gizmodoTweetsSet.preTraverse(x => println(x.text))
  val aTweets = TweetReader.getTweetSet("gizmodo")
  //  aTweets.preTraverse(x => println(x.text))

  // Test filter
  val targetTweets = gizmodoTweets
  val targetTweetsSet = TweetReader.toTweetSet(targetTweets)
  //  targetTweetsSet.preTraverse(x => println(x.text))

  //  println("===== Filtered by text containing 'will' ===")
  val filteredTweets = targetTweetsSet.filterAcc(x => x.text.contains("will"), new Empty())
  //  filteredTweets.preTraverse(x => println(x.text))

  // Test Union
  val tsA = TweetReader.toTweetSet(List(new Tweet("Apple", "This is Apple", 12), new Tweet("Banana", "This is Banana", 13), new Tweet("Bear", "This is Bear", 14)))
  val tsB = TweetReader.toTweetSet(List(new Tweet("AppleC", "This is AppleC", 12), new Tweet("BananaC", "This is BananaC", 13), new Tweet("BearC", "This is BearC", 14)))
  val tsC = new Empty()
  //  val tsAC = tsA union tsC
  //  println("=== tsAC ===")
  //  tsAC print
  //  val tsCA = tsC union tsA
  //  println("=== tsCA ===")
  //  tsCA print
  //  val tsCB = tsC union tsB
  //  println("=== tsCB ===")
  //  tsCB print
  //  val tsAB = tsA union tsB
  //  println("=== tsAB ===")
  //  tsAB print

  // Test isInstanceOf
//  assert(tsA.isInstanceOf[Empty] == false, "tsA should be NonEmpty")
//  assert(tsA.isInstanceOf[NonEmpty] == true, "tsA should be NonEmpty")

  // Test mostRetweeted
  val aTweet = tsB.mostRetweeted
  print(aTweet)
  
  // Test descendingByRetweet
  val tl = targetTweetsSet.descendingByRetweet
//  tl.foreach(print(_))

  // Test in
  def in(ll: List[String], tt: Tweet): Boolean = {
     ll.exists(tt.text.contains(_))
  }
  
//  assert(in(List("Apple", "Applex", "Applew", "Appleq", "Appleqq", "Applex"), new Tweet("Apple", "This is Apple", 12)) == true, "Should be true")
//  assert(in(List("Apple", "Applex", "Applew", "Appleq", "Appleqq", "Applex"), new Tweet("Apple", "This is qer", 12)) == false, "Should be false")
}














