class AquariumFish {




    class Shark: FishAction, FishColor {
        override val color = "grey"
        override fun eat() {
            println("hunt and eat fish")
        }
    }

    class Plecostomus (fishColor: FishColor = GoldColor):
        FishAction by PrintingFishAction("eat algae"),
        FishColor by fishColor
    fun makeFish() {
        val shark = Shark()
        val pleco = Plecostomus()

        println("Shark: ${shark.color}")
        println("Plecostomus: ${pleco.color}")
    }

    fun main () {
        makeFish()
    }
    object GoldColor : FishColor {
        override val color = "gold"
    }


    class PrintingFishAction(val food: String) : FishAction {
        override fun eat() {
            println(food)
        }
    }

}