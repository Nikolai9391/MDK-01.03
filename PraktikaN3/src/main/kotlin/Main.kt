import kotlin.math.roundToInt
import kotlin.math.sqrt
import kotlin.random.Random

fun main() {

    // 1 задача

    val myAge = 19
    val isTeenager:Boolean = 13 <= myAge && myAge <= 19
    println(isTeenager)

    // 2 задача

    val theirAge = 30
    val bothTeenagers:Boolean = 13 <= myAge && myAge <= 19 && 13 <= theirAge && theirAge <= 19
    println(bothTeenagers)

    // 3 задача

    val reader  = "Yakov"
    val author  = "Richard Lucas"
    val authorIsReader  = reader == author
    println(authorIsReader)

    // 4 задача

   val readerBeforeAuthor = reader > author
    println(readerBeforeAuthor)

    // 5 задача

    val myAge2: Int = 19
     if (13 <= myAge2 && myAge2 <= 19){
         println("Подросток")
     } else println("Не подросток")

    // 6 задача

     val answer = if (13 <= myAge2 && myAge2 <= 19) println("Подросток") else ("Не подросток")

    // 7 задача

    var counter = 0
    while (counter < 10){
        var x = counter
        counter ++
        println(x)
    }

    // 8 задача

    var roll = 0
    do {
        roll = Random.nextInt(6)
        var y = roll
        println("после $counter бросков roll будет равен $y")
    } while (counter<0)

    // 9 задача
    val range = 1
    var square = 0
    for (range in range .. 10){
       square = range * range
        println("Возведение в степень " + square)
    }

    // 10 задача
    var bringOut = 0
    for (range in range .. 10){
        bringOut = sqrt(range.toDouble()).toInt()
            println("Извлекание корня " + bringOut)
    }

    // 11 задача
    var sum = 0
    for (row in 0 until 8 ) {
        if (row % 2 == 0){
         continue
        }
        for (column in 0 until 8 ){
            sum += row * column
        }
        println(sum)
    }
}