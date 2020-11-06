class Warrior(name:String):Hero(name){
    override var Health: Int=150
    override var Mana: Int=0
    override var Stamina: Int=100
    override var dmgmulti: Double=2.0


    override fun takedmg(dmg: Int): Int {
        return if (Stamina<=0){
            Stamina+=5
            Health-=dmg
            dmg

        } else{
            Stamina-=10
            if (Stamina<=0)
                Stamina=0
            Health-=(dmg*1.5).toInt()
            dmg
        }
    }

    override fun atack(Target: Hero):Int {
        return Target.takedmg((getdmg()*dmgmulti).toInt())
    }













}