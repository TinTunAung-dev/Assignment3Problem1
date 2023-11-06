fun main() {
    print("Enter number: ")
    val input = readLine()
    if (input != null){
        try {
            val number = input.toInt()
            val firstDigit = number.toString()[0].toString().toInt()
            val lastDigit = number % 10
            println("First Digit: $firstDigit")
            println("Last Digit: $lastDigit")
        }catch (exception: NumberFormatException){
            println("Invalid input")
        }
    }else{
        println("Invalid input")
    }
}
