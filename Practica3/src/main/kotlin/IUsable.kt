interface IUsable {

    fun canUse(condition: (Player)-> Boolean, player:Player ) :Boolean{
        return condition(player)
    }

}