object Main {

  //2-8初級問題
  //isSchoolStartedについての説明が問題に書かれていないので、無視して作成
  //解答を見る限り、isSchoolStartedは小学校入学済みを示すフラグ？として扱う模様
  def printIsBaby(age: Int, isSchoolStarted: Boolean): Unit = {
    if (1 <= age && age <= 6 && !isSchoolStarted) {
      println("幼児です")
    } else {
      println("幼児ではありません")
    }
  }


  //2-8中級問題
  def loopFrom0To9(): Unit = {
    var i = 0
    do {
      println(i)
      i = i + 1
    } while (i<10)
  }


  //2-8上級問題
  //三平方の定理を使って、総当たりで直角三角形を求める(aが斜辺)
  def printRightTriangles(): Unit =
    for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000 if a*a==b*b+c*c) println((a, b, c))
}
