package Buildings

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf<Directions>(Directions.START)
    var north = { path.add(Directions.NORTH) }
    var south = { path.add(Directions.SOUTH) }
    var east = { path.add(Directions.EAST) }
    var west = { path.add(Directions.WEST) }
    var end = {
        path.add(Directions.END);
        println("Game Over");
        for (i in path) {
            println(i.name)
        }
        path.removeAll(path)
    }

    fun move(where: () -> Boolean) {
        where()
    }

    fun makeMove(snull: String?) {
        when (snull) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }

    }
}

fun main (args : Array<String>) {
    val game = Game()
    //println(game.path)
    //game.north()
    //game.west()
    //game.east()
    //game.south()
    //game.end()
    //println(game.path)
    while(true) {
        print("Enter a direction: n/s/e/w")
        game.makeMove(readLine())
    }
}

//fun List<Int>.divThree(block: (Int) -> Int) : List<Int> {
//    val result = mutableListOf<Int>()
//    for (item in this) {
//        if (block(item) == 0) {
//result.add(item)
//            }
//        }
//    return result
//    }
//n}