import java.util.*

fun main (args : Array<String>) {
    val beersOffered = listOf<String>("Bud Light", "Corona")
    val liquorOffered = listOf<String>("Old Crow", "Jameson", "Fernet Branca")
    var currentBeer = listOf<String>("Bud Light")
    var currentLiquor = listOf<String>("Jameson")

}

fun stockBar (eightsix : List<String> = listOf<String>(""), current : Array<String>, offered : List<String>): MutableList<String> {
    var whatToGet = mutableListOf("")
    whatToGet.addAll(offered)
    whatToGet.removeAll(eightsix)
    whatToGet.removeAll(current)
    return whatToGet
}

fun organize() {

}

fun juice() {

}

val takeShot = { abv : Double -> abv + 0.1}
val playTunes = { Random().nextInt(4)}


fun getHype(shot: (Double)) : Double {
    return shot
}

fun checkNotes() {

}