/**
 * Closure Example in Scala
 * 
 * A closure is a function that captures variables from its surrounding lexical scope.
 * Even after the outer function returns, the closure retains access to these variables.
 * This demonstrates lexical scoping and variable capture in functional programming.
 */

/**
 * Function that creates and returns a closure
 * @param x Parameter that will be captured by the closure
 * @return A function that captures both x and y from the lexical scope
 */
def f(x: Int) = {
  // Local variable in the outer function's scope
  val y = 2
  
  // This is a closure - it captures both 'x' (parameter) and 'y' (local variable)
  // from the enclosing scope. Even after f() returns, the returned function
  // will still have access to these values.
  (z: Int) => x + y + z
}

@main def run() = {
  // Call f(3) which returns a closure that has captured x=3 and y=2
  val c = f(3)
  
  // Call the closure with argument 4
  // The closure computes: captured_x + captured_y + z = 3 + 2 + 4 = 9
  val result = c(4)
  
  // Display the result
  println(s"Result of the closure: $result") // Should print 9
}