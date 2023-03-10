object StringOps extends App {
  val str: String = "Hello, I am learning Scala"
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length)
  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))


  // String interpolators
  // s- interpolators
  val name = "shiva"
  val age = 24
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I am ${age + 1} years old"
  println(greeting)
  println(anotherGreeting)
  //F- interpolators
  val speed =  1.2f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)
  //raw - interpolator
  println(raw"This is a \n newLine")
  val escaped = "This is a \n newline"
  println(escaped)
}
