package porblem4

class Ebook(private var title: String, private var author: String, private var price: Double, private var fieldType: String):
Book(title, author, price){

    var bookFieldType
    get() = fieldType
    set(value) {
        fieldType = value
    }

    override fun read() {
        println("Read from Electronic Device")
    }
}