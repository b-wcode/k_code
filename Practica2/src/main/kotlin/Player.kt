import kotlin.math.abs




class Player (val Name:String , val MaxStength:Int) {

 val BackPack= mutableListOf<IPickable>() ;


    fun CurentLoad():Int{

       var load=0
       BackPack.forEach {
          load=load + it.GetWeight()
       }
       return load
    }


    fun CanPick (Obj:IPickable):Boolean{
     return if(MaxStength-CurentLoad()-Obj.GetWeight()>=0) true else false
    }

    fun TryPick(Obj:IPickable){

        val name= Obj.GetName()
        val weight=Obj.GetWeight()


       if (CanPick(Obj)){

          BackPack.add(Obj)
          println("Picked ($name +$weight) Curent load: ${CurentLoad()}/${MaxStength}")
       }else{

          println("Cannot add ($name +$weight). Exceeds by ${abs(MaxStength-(CurentLoad()+weight))} (${CurentLoad()}/${MaxStength})")
       }


    }

    fun ListBackpack(){
      println("Backpack: ")
      BackPack.forEach{
         print(it.GetName()+ " ")
      }

    }


}