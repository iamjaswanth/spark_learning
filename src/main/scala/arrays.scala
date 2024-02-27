object arrays {
  var arr2 = Array(2, 3, 4, 5)
  var trgt = 0
  val myArray = Array("apple", "banana", "orange", "grape")
  val doubleArray = Array(3.14, 2.718, 1.618, 9.81)
  var max = doubleArray(0)
  val reversedArr = new Array[String](myArray.length)

  val a = Array(1,2,3)
  val b = Array(4,5,5)
  def main(args: Array[String]): Unit = {
    for (i <- 0 until arr2.length) { // Use until instead of to to avoid IndexOutOfBoundsException
      println(arr2(i))
      trgt = trgt + arr2(i)
      println(trgt)
    }


    for (i <- 0 until myArray.length) {
      reversedArr(i) = myArray(myArray.length - 1 - i)
      println(reversedArr(i))
    }
    for (i <- 0 until doubleArray.length) {
      if (doubleArray(i) > max) {
        max = doubleArray(i)
      }
    }
    println(max)
    val c = a ++ b
    println(c)

    }
}

