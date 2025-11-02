abstract class Weapon (val name:String,val damage:Int, val weight:Int, val slots:String) :IPickable{
    override fun GetWeight(): Int {
        return weight
    }

    fun GetDamage():Int{
        return damage
    }

    fun GetSlots():String{
        return slots
    }

    override fun GetName():String{
        return name
    }

}