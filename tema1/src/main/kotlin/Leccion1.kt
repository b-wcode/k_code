import java.util.*

fun printHello() {
    println ("Hello World")
}



fun main() {

    printHello()
           // operators and types

    println(1+1)
    println(2.0*3.5)
    println(6.0*50.0)
    println(3.5.plus(4))
    val numberOfFish = 5
    val numberOfPlants = 12
    print("I have ${numberOfFish + numberOfPlants} fish and plants")


         // compare conditions and booleans

    val nrOfFish = 50
    val nrOfPlants = 23
    if (nrOfFish > nrOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }
    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }
    when (nrOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }



        // nullability

    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
        print(fishFoodTreats)
    }
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    println(fishFoodTreats)

    // 5. Explore arrays, lists, and loops


    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])


    val sch = arrayOf("shark", "salmon", "minnow")
    for (element in sch) {
        print(element + " ")
    }
    for ((index, element) in sch.withIndex()) {
        println("Item at $index is $element\n")
    }

    //Lection 2

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    fun randomDay() : String {
        val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
        return week[Random().nextInt(week.size)]
    }
    fun fishFood (day : String) : String {
        var food = ""
        when (day) {
            "Monday" -> food = "flakes"
            "Tuesday" -> food = "pellets"
            "Wednesday" -> food = "redworms"
            "Thursday" -> food = "granules"
            "Friday" -> food = "mosquitoes"
            "Saturday" -> food = "lettuce"
            "Sunday" -> food = "plankton"
        }
        return food
    }

    fun feedTheFish() {
        val day = randomDay()
        val food = fishFood(day)

        println ("Today is $day and the fish eat $food")
    }
    feedTheFish()

    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println( decorations.filter {it[0] == 'p'})



    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
   println(waterFilter(20))
}