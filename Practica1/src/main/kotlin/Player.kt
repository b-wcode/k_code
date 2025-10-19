import kotlin.math.abs

data class Equipaje(val Name: String, val Weigth: Int)


class Player (val Name:String , val MaxStength:Int) {

 val BackPack= mutableListOf<Equipaje>() ;


    fun CurentLoad():Int{

       var load=0
       BackPack.forEach {
          load=load + it.Weigth
       }
       return load
    }


    fun CanAdd (Obj:Equipaje):Boolean{
     return if(MaxStength-CurentLoad()-Obj.Weigth>=0) true else false
    }

    fun TryAdd(Obj:Equipaje){

       if (CanAdd(Obj)){

          BackPack.add(Obj)
          println("Added ${Obj.Name} (+${Obj.Weigth}) Curent load: ${CurentLoad()} /${MaxStength}")
       }else{

          println("Cannot add ${Obj.Name} (+${Obj.Weigth}). Exceeds by ${abs(MaxStength-(CurentLoad()+Obj.Weigth))} ${CurentLoad()} /${MaxStength}")
       }


    }

    fun ListBackpack(){
      println("Backpack: ")
      BackPack.forEach{
         print(it.Name+ " ")
      }

    }


}