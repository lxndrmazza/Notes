package practiceSpice

sealed abstract class Spice (val name : String, val spiciness : String = "mild", color: SpiceColor) : SpiceColor by color {
    val heat : Int
        get() {
            return when (spiciness) {
                "fuego fuego" -> 10
                "caliente" -> 9
                "hot" -> 7
                "mild" -> 5
                "flavorful" -> 2
                "gringo" -> 0
                else -> 5
            }
        }
    init {
        println("${this.name} has been made, it is ${this.spiciness} or has a ${this.heat} level of spice")
    }
    abstract fun prepareSpice()


}

interface Grinder {
    fun grind() {

    }
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {
    override fun grind() {

    }

    override fun prepareSpice() {
        grind()
    }

}

interface SpiceColor {
    val color : Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}
