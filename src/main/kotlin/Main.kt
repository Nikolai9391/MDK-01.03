import kotlin.math.sqrt

 fun main(args: Array<String>) {

     // 1 задание

     fun printFullName (firstName:String, lastName:String) {
         println("$firstName" + " " + "$lastName")
     }

     // 2 задание

      printFullName(firstName = "Яков", lastName = "Торотько")

     // 4 задание

     fun calculateFullName(fullName:String, nameLenght: Int): Pair<String, Int> {
         return Pair(fullName, nameLenght)

     }

     // 3 задание

     val fullName = calculateFullName(fullName = "Яков Торотько", nameLenght = "Яков Торотько".length)
     println(fullName)

     // 5 задание

     fun divisible(number: Int, divisor: Int): Boolean {
         return number % divisor == 0
     }

     fun singleDigit(number: Int): Boolean {

         if (number <= 1) {
             return false
         }

         val doubleNumber = number.toDouble()
         val root = (sqrt(doubleNumber)).toInt()
         for (divisor in 2..root) {
             if (divisible(number, divisor)) {
                 return false
             }
         }
         return true
     }

     println(singleDigit(4))


     // 6 задание

     fun fibonacciNumbers(number: Int): Int {
         if (number <= 0) {
             return 0
         }

         if (number == 1 || number == 2) {
             return 1
         }

         return fibonacciNumbers(number - 1) + fibonacciNumbers(number - 2)
     }
     println(fibonacciNumbers(10))

 }











