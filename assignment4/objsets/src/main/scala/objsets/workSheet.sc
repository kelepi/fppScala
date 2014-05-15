package objsets

object workSheet {
  val sites = List("gizmodo", "TechCrunch", "engadget", "amazondeals", "CNET", "gadgetlab", "mashable")
                                                  //> sites  : List[String] = List(gizmodo, TechCrunch, engadget, amazondeals, CNE
                                                  //| T, gadgetlab, mashable)
  val abc = TweetReader.getTweetSet(sites(0))     //> abc  : Option[objsets.TweetSet] = Some(objsets.NonEmpty@5362efd8)
  abc.foreach(print(_))                           //> objsets.NonEmpty@5362efd8
  
  TweetReader.printATweetSet()                    //> User: gizmodo
                                                  //| Text: Kindle Paperwhite Review: Forget Everything Else, This Is the E-Reader
                                                  //|  You Want http://t.co/737W6aNC [51]User: gizmodo
                                                  //| Text: Ever wonder why the sky is dark at night? Here's your answer. http://t
                                                  //| .co/eTKxkcaE [86]User: gizmodo
                                                  //| Text: 18 unlucky people who already broke the iPhone 5: http://t.co/9RpvX4te
                                                  //|  [79]User: gizmodo
                                                  //| Text: 14 people who should be ashamed of their @foursquare mayorship http://
                                                  //| t.co/7AEHQJLT [50]User: gizmodo
                                                  //| Text: 12 deadly inventions that killed their creators (not for the faint of 
                                                  //| heart) http://t.co/BCwRAzhe [82]User: gizmodo
                                                  //| Text: (In case you're wondering who the awesome speller is, that's @brentros
                                                  //| e. He has an MFA.) [2]User: gizmodo
                                                  //| Text: 10 stupid, crazy, wonderful gadget fails http://t.co/p3Al28G5 [32]User
                                                  //| : gizmodo
                                                  //| Text: 18 places carbon fiber just doesn't belong: http://t.co/vJo1Yhlj [21]U
                                                  //| ser: gizmodo
                                                  //| Text: Cold brew Irish coffee! It's the best part of waking up 
                                                  //| Output exceeds cutoff limit.
 
                                             
}