


fun main(){

    val player =Player("Aranthor",15)

    println("player: ${player.Name}, MaxStrength: ${player.MaxStength}")

    val ob1 =Key()
    val ob2 =Scroll()
    val ob3 =Treasure()
    val ob4 =Potion()

    player.TryPick(ob1)
    player.TryPick(ob2)
    player.TryPick(ob3)
    player.TryPick(ob4)
    player.ListBackpack()

}