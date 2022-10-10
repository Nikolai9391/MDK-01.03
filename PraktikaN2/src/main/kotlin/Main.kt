   fun main(args: Array<String>)
{
    // 1 задача
    val age1: Double = 42.0
    val age2: Double = 21.0

    // 2 задача
    val avg1 = age1 + age2 / 2 // Должен быть тип Double

    // 4 задача
    val firstName:String = "Яков"
    val lastName:String = "Торотько"

    // 5 задача
    val fullName:String = firstName + " " + lastName
    println(fullName)

    // 6 задача
    val myDetails:String = "Привет, меня зовут $fullName"
    println(myDetails)

    // 7 задача
    val dates = Triple (12,5,2019)

    // 8 задача
    val (month, day, year) = dates

    // 9 задача
    val monthAndYear = """
        |$month
        |
        |$year
        """.trimMargin()
    println(monthAndYear)

    // 10 задача




}