object Hello extends App {
  println("Hello World")
  var fahrenheit = 35.5
  val celsius = (fahrenheit - 32D) * (5D / 9D)
  println(celsius)
  // To convert temperature from degrees Fahrenheit to degrees Celsius, you first need to subtract the temperature by 32 and then multiply it by 5 divided by 9.

  val age = 18
  val name = "Ben"

  println(s"$name is ${age} years old.")

  // Formatting strings

  val result = 7/3F
  println(f"The quotient is: $result%,f" )

  // expresion regular

  var cadena = "El primero"
  var expresion = "El".r
  var b = expresion.findFirstIn(cadena)
  println(b)

  // challenge searching a string

  val stringToFindExpression = "The car is red."
  val match1 = "[a-z]{3}".r.findFirstIn(stringToFindExpression)
  println(match1)

  val regularExp = "[a-z]{4}".r

  val replaceIn = "She is four years old "

  val replaced = regularExp.replaceFirstIn(replaceIn,"five")

  println(replaced)

  import scala.collection.mutable.ArrayBuffer

  val myFirstArrayBuffer = ArrayBuffer(1,2,3,4,5)

  // Driver Code
  myFirstArrayBuffer.foreach(println)

  // Write your code here

  val finalArray = Array(0,0) // Modify finalArray


}
