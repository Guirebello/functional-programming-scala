/**
 Demonstrates the use of the reduce function to aggregate elements in a list in Scala.
*/
package reduce

/**
 List of integers to be aggregated.
*/
val numbers = List(1, 2, 3, 4, 5)

/**
 The sum of all elements in 'numbers' using reduce.
*/
val sum = numbers.reduce((a, b) => a + b)

/**
 The product of all elements in 'numbers' using reduce.
*/
val product = numbers.reduce((a, b) => a * b)

/**
 Tests reduce on a singleton list and (commented) on an empty list.
 Demonstrates border cases for reduce.
*/
def testBorderCases(): Unit =
  val singletonReduction = List(42).reduce((a, b) => a + b)
//   val emptyReduction = List.empty[Int].reduce((a, b) => a + b) // error

  println(s"Soma de um único elemento: $singletonReduction")
//   println(s"Tentativa de redução em uma lista vazia: $emptyReduction")

/**
 Traces the reduction process by printing the accumulator and current element at each step.
*/
def traceReduction() =
    val sum = numbers.reduce((a, b) => {
        println(s"Acumulador: $a, Elemento atual: $b")
        a + b
    })

/**
 Main function that prints the original list, the sum, the product, and runs the border case and trace demonstrations.
*/
@main def run(): Unit =
  println(s"Números originais: $numbers")
  println(s"Soma: $sum")
  println(s"Produto: $product")
  testBorderCases()
  traceReduction()
