package practiceSpice

class SimpleSpice {
    val name : String = "curry"
    val spiciness : String = "mild"
    val heat : Int
        get() {
            return when (spiciness) {
            "mild" -> 5
            else -> 5
        }
    }
}