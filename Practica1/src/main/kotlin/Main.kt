
fun main(){

    val player =Player("Aranthor",20)

    println("player: ${player.Name}, MaxStrength: ${player.MaxStength}")

    val ob1 =Equipaje("Sword",10)
    val ob2 =Equipaje("Potion",3)
    val ob3 =Equipaje("Treasure",15)

    player.TryAdd(ob1)
    player.TryAdd(ob2)
    player.TryAdd(ob3)
    player.ListBackpack()
}