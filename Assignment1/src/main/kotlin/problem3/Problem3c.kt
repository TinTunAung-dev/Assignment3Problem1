fun main() {
    print("Enter your weight in pounds: ")
    val weightInPounds = readLine()?.toDouble()

    if (weightInPounds != null) {
        println("Select a planet:")
        println("1. Venus")
        println("2. Mars")
        println("3. Jupiter")
        println("4. Saturn")
        println("5. Uranus")
        println("6. Neptune")

        print("Enter your choice (1-6): ")
        val choice = readLine()?.toInt()

        if (choice != null) {
            val weightOnPlanet = when (choice) {
                1 -> weightInPounds * 0.78
                2 -> weightInPounds * 0.39
                3 -> weightInPounds * 2.65
                4 -> weightInPounds * 1.17
                5 -> weightInPounds * 1.05
                6 -> weightInPounds * 1.23
                else -> {
                    println("Invalid choice. Please select a planet from 1 to 6.")
                    return
                }
            }

            println("Your weight on the selected planet is: $weightOnPlanet pounds")
        } else {
            println("Invalid choice. Please enter a valid choice (1-6).")
        }
    } else {
        println("Invalid weight. Please enter a valid weight in pounds.")
    }
}
