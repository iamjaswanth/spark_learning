import scala.collection.mutable.ArrayBuffer
object arrays {

  var arr2 = Array(2, 3, 4, 5)
  var trgt = 0
  var sumArray= 0
  val myArray = Array("apple", "banana", "orange", "grape")
  val doubleArray = Array(3.14, 2.718, 1.618, 9.81)
  var max = doubleArray(0)
  val reversedArr = new Array[String](myArray.length)
  var even_numbers = Array(2, 3, 4, 5)
  val numbers = Array(1, 2, 3, 4, 5,10,7,333,20)

  val a = Array(1,2,3)
  val b = Array(4,5,5)
  def main(args: Array[String]): Unit = {
    // Sum of elements in arr2
    for (i <- 0 until arr2.length) { // Use until instead of to to avoid IndexOutOfBoundsException
      println(arr2(i))
      trgt = trgt + arr2(i)
      println(trgt)
    }

    // Reverse myArray
    for (i <- 0 until myArray.length) {
      reversedArr(i) = myArray(myArray.length - 1 - i)
      println(reversedArr(i))
    }
    // Maximum element in doubleArray
    for (i <- 0 until doubleArray.length) {
      if (doubleArray(i) > max) {
        max = doubleArray(i)
      }
    }
    println(max,"maximum element in an array of doubles.")
    val c = a ++ b
    println(c)
    // Sum of elements in numbers array and average
    for(i <- 0 until numbers.length){
      sumArray = sumArray + numbers(i)
      println(sumArray)
    }
    println(sumArray/numbers.length,"average of elements in an array of integers")
    // Check if "orange" exists in myArray
    for(i <- 0 until myArray.length){
      if (myArray(i) == "orange"){
        println("Its orange from the array ")
      }
    }
    // Filtering even numbers from even_numbers array
    for(i <- 0 until even_numbers.length){
      if (even_numbers(i)%2 == 0){
        var  element  = even_numbers(i)
        val buffer = ArrayBuffer[Int]()
        buffer ++= even_numbers.filter(_ != element)
        buffer.toArray
        println(buffer)
      }
    }

    for(i <- 0 until numbers.length){
      if(numbers(i)>numbers(i+1)){
        print("Array is Sorted")
        return
      } else {
        print("Array is not Sorted")
        return
      }

    }


    }
}

