import java.util.*

//fun main(args: Array<String>) {

    //println("${ if (args[0].toInt() < 0 || args[0].toInt() > 23) "The time has left, such has also our hope."
    //else if (args[0].toInt() < 12) "Good Morning" else "Good night"
    //}")

    //dayOfWeek()

    //feedTheFish()
    //var tune : String
    //for (i in 1..10 ) {
    //    tune = getFortuneCookie()
    //    println("\nYour fortune is: $tune")
    //    if (tune == "Take it easy and enjoy life!") {
    //        println("Well thats all your need")
    //    break
    //    }
    //}
//}
fun main(args: Array<String>) {
    //var fortune: String
    //for (i in 1..10) {
     //   fortune = getFortune(getBirthday())
     //   println("\nYour fortune is: $fortune")
     //   if (fortune.contains("Take it easy")) break;
    //}
       println(fitMoreFish(10.0, listOf(), 7,true) )

}

fun getBirthday() : Int {
    print("\nEnter your birthday, please")
    return readLine()?.toIntOrNull() ?: 1
}



fun dayOfWeek() {
    println("What day is it today?")

    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        2 -> println("It's Monday")
        3 -> println("It's Tuesday")
        4 -> println("It's Wednesday")
        5 -> println("It's Thursday")
        6 -> println("It's Friday")
        7 -> println("It's Saturday")
        1 -> println("It's Sunday")
        else -> "it is upon us, the time has come. Doom will soon consume us all. Let us REJOICE!!!!"
    }
}
 fun feedTheFish() {
     val day = "Tuesday"
     val food = "pellets"
     println ("Today is $day and the fish eat $food")
 }

    fun randomDay() {
        val week = listOf ("Monday", "Tusday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    }

    fun getFortune(birthday : Int): String {
        val fortunes = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune."
        )

        return when (birthday) {
            1,2,3,4 -> fortunes[0]
            8,7,6,5 -> fortunes[1]
            9,10,11,12 -> fortunes[2]
            13,14,15,16 -> fortunes[3]
            20,19,18,17,31 -> fortunes[4]
            24,23,22,21,30 -> fortunes[5]
            28,27,26,25,29 -> fortunes[6]
            else -> "you're fucked"
        }
    }

fun fitMoreFish(tankSize : Double, currentFish : List<Int>, fishSize : Int = 2, hasDecorations : Boolean = true): Boolean {
    var fishMass : Int = 0
    for (fish in currentFish) {
        fishMass += fish
    }
    fishMass += fishSize
    var newSize : Double
    return if (hasDecorations) {
        newSize = tankSize * .8
        fishMass <= newSize
    } else fishMass <= tankSize

}