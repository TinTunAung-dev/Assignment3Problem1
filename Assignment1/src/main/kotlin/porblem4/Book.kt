package porblem4

open class Book(private var title: String, private var author: String, private var price: Double) {
    // Getter and Setter for title
    var bookTitle
        get() = title
        set(value) {
            title = value
        }

    // Getter and Setter for author
    var bookAuthor
        get() = author
        set(value) {
            author = value
        }

    // Getter and Setter for price
    var bookPrice
        get() = price
        set(value) {
            price = value
        }

    // Constructor to initialize fields
    init {
        this.bookTitle = title
        this.bookAuthor = author
        this.bookPrice = price
    }

    // Behavior for reading a paper book
    open fun read() {
        println("Reading Paper book")
    }
}