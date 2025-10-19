class Treasure:IPickable{
    override fun GetName(): String {
        var Name="Treasure"
        return  Name
    }

    override fun GetWeight(): Int {
        var  Weight=10;
        return Weight
    }
}