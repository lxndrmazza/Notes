package practiceSpice

fun main (args : Array<String>) {
    //val curry = SimpleSpice()
    //println("The Spice is ${curry.name} and it's heat index is ${curry.heat}")
    //val Spices = listOf(
    //    Spice("curry", "mild"),
    //    Spice("pepper", "medium"),
    //    Spice("oregano", "gringo"),
    //    Spice("ginger", "flavorful"),
    //    Spice("red curry", "caliente"),
    //    Spice("hot pepper", "fuego fuego")
    //)
    //val spiceList = Spices.filter { it.heat <= 5 }

    //val gPepper = Spice("Ghost Pepper", "fuego fuego")

    //for (i in spiceList) { println("${i.name}") }

    //fun makeSalt() = Spice("Salt")
    //var gCurry : Curry = Curry("green curry", "mild")
    //var rCurry : Curry = Curry("red curry", "hot")
    //val greenie : SpiceContainer = SpiceContainer(gCurry)
    //val redie : SpiceContainer = SpiceContainer(rCurry)
    //println(greenie.label)
    //println(redie.label)

    val Gatsby = Book("The Great Gatsby", "F. Scott Fitzgerald", 1925)
    println("The book is ${Gatsby.whoWhatWhen().first} by ${Gatsby.whoWhatWhen().second} written in ${Gatsby.whoWhatWhen().third}")

    val allBooks = setOf<String>(
        "The REBT companion",
        "The Art of Silence",
        "How to lose your dog, if you know what I mean"
    )

    val library = mapOf("Who Knows" to allBooks)

    println(library.any { it.value.contains("The Art of Silcence") })

    val moreBooks = mutableMapOf<String, String>()
    moreBooks.getOrPut("Flight of the bird") {"Not a bird"}


}