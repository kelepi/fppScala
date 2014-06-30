case class Pos(x: Int, y: Int) {
  /** The position obtained by changing the `x` coordinate by `d` */
  def dx(d: Int) = copy(x = x + d)

  /** The position obtained by changing the `y` coordinate by `d` */
  def dy(d: Int) = copy(y = y + d)
}

val level =
  """------
    |--ST--
    |000000
    |------
  """
    .stripMargin

private lazy val vector: Vector[Vector[Char]] =
  Vector(level.split("\n").map(str => Vector(str: _*)): _*)

//vector(5)(2)
def terrainFunction(levelVector: Vector[Vector[Char]]): Pos => Boolean = {
  def terrain(pos: Pos): Boolean = {
    try {
      levelVector(pos.x)(pos.y) != '-'
    } catch {
      case ex: IndexOutOfBoundsException => false
    }
  }
  terrain
}

def findChar(c: Char, levelVector: Vector[Vector[Char]]): Pos = {
  val ps = for {
    x <- 0 until levelVector.length
    y <- 0 until levelVector(x).length
    if (levelVector(x)(y) == c)
  } yield new Pos(x, y)
  ps.head
}

findChar('S', vector)
findChar('T', vector)
findChar('0', vector)
findChar('-', vector)

val tf = terrainFunction(vector)
vector(1)(3)
tf(new Pos(1,3))
vector(1)(1)
tf(new Pos(1,1))
tf(new Pos(5,3))

val a = List(1,2,3,4).toStream

val s = Set(1,2,3)
val n = 4
s.exists(x => x == n)
s.exists(x => x == 3)

