package practiceSpice

import java.util.*

open class Book (val title : String = "",val author: String = "", val year : Int = 0, var pages : Int = 10){
    private var currentPage : Int = 0
    private var booksBorrowed: Int = 0


    companion object {
        const val BASE_URL = ("www.herearemybooks.com")
        const val MAX_NUM_BOOKS = 20
    }

    //fun printUrl("$BASE_URL/$title.html")

    open fun readPage() {
        currentPage++
    }

    fun whoWhat() : Pair<String,String>{
        return (title to author)
    }
    fun whoWhatWhen() : Triple<String,String, Int>{
        return Triple(title, author, year)
    }
    fun canBorrow() {
    }
}

class eBook(format : String = "text") : Book() {
    private var wordsRead : Int = 0
    override fun readPage() {
        wordsRead =+ 250
    }
}

val allBooks = setOf<String>(
    "The REBT companion",
    "The Art of Silence",
    "How to lose your dog, if you know what I mean")

val library = mapOf("Who Knows" to allBooks )

fun Book.weight() : Double {
    return pages * 1.5
}

fun Book.tornPages(torn : Int = 0) = if (pages >= torn) pages -= torn else pages = 0

class Puppy {
    fun playWithBook(book : Book) {
        book.tornPages(Random().nextInt(10))
    }
}

val mrBear = Puppy()

val barBook = Book("How to be on the clock AND the Wagon", "Alex Mazza", 2020, 50)

fun destroyBook(){

    while (barBook.pages > 0) {
        mrBear.playWithBook(barBook)
    }
}



