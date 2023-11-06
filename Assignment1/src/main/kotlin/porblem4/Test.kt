package porblem4

fun main() {
    // Create a Book object and set its properties using getters and setters
    val book = Book("Book 1", "John", 19.99)
    book.bookTitle = "Book Title"
    book.bookAuthor = "Jane"
    book.bookPrice = 14.99

    // Create an EBook object and set its properties using getters and setters
    val ebook = Ebook("EBook Title", "EBook Author", 9.99, "PDF")
    ebook.bookTitle = "Updated EBook Title"
    ebook.bookAuthor = "Updated EBook Author"
    ebook.bookPrice = 7.99
    ebook.bookFieldType = "ePub"

    // Call the read method for both the Book and EBook
    book.read()
    ebook.read()
}