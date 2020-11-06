import kotlin.random.Random

abstract class Hero(val name:String) {
    abstract var Health:Int
    abstract var Mana:Int
    abstract var Stamina:Int
    abstract var dmgmulti:Double

    abstract fun atack(Target:Hero):Int

    abstract fun takedmg(dmg:Int):Int

    fun getdmg()= Random.nextInt(1,15)
    fun dead():Boolean{
        return Health<=0
    }
   fun chil(){
       Health=100
   }



}