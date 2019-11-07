import java.util.*

fun main(args : Array<String>) {
    println(whatShouldIdDoToday(weather = "sunny"))
}

fun whatShouldIdDoToday(mood: String? = howYouFeelin(), weather : String = "sunny", temperature : Int = 72) : String {
        return when {
            mood == "sober" && weather == "sunny" && temperature > 50 ->"drink at Bilt"
            mood == "hungover" && weather == "sunny" && temperature > 50 ->"ace's biscuits"
            mood == "hungover" && weather == "sunny" && temperature < 50  ->"white spot"
            mood == "sad" && weather =="sunny" && temperature > 50 -> "go for a hike"
            mood == "sad" && weather =="sunny" && temperature < 50 -> "go for a drive"
            mood == "sad" && weather =="cloudy" && temperature > 50 -> "troll comment sections of FB & reddit"
            mood == "hungover" && weather == "cloudy" -> "I'm not saying to smoke weed but I'm also not, not saying that"
            else -> "play video games"
        }
}

val rollDice = { sides : Int -> if (sides == 0 ) 0 else Random().nextInt(sides) +1 }
val rollDice2 : (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random().nextInt(sides)
}

fun gamePlay(operation :  Int) {
    println(operation)
}


fun howYouFeelin(): String? {
    println("\nHow you feelin' today?")
    return readLine()

}
