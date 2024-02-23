object helloworld {

  def main(args: Array[String])
  {
    for (i<-1 to 100){
      println(i)
    }
    var i = 1
    while (i <= 50) {
      println(i)
      i += 1
    }

    val numRows = 5

    // Loop through each row
    for (i <- 1 to numRows) {
      // Loop to print numbers in each row
      for (j <- 1 to i) {
        print(j)
        // Print a comma if it's not the last number in the row
        if (j < i) {
          print(",")
        }
      }
      // Print a new line after each row
      println()
    }
    var a = 1
    // Loop through each row
    for (i <- 1 to 5) {
      // Loop to print numbers in each row
      for (j <- 1 to i) {
        print(a)
        a= a+1
        if (j < i) {
          print(",")
        }


      }
      // Print a new line after each row
      println()
    }

  }

}


