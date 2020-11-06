class Mag(name:String):Hero(name) {
    override var Health: Int=100
    override var Mana: Int=50
    override var Stamina: Int=25
    override var dmgmulti: Double=0.5

    override fun atack(Target: Hero):Int {
        return Target.takedmg((getdmg()*1.5).toInt())

    }

    override fun takedmg(dmg: Int): Int {
        return if (Stamina<=0 && Mana<=0){
            Stamina+2
            Mana+2
            Health-=dmg
            dmg
        } else{
            Stamina-1
            Mana-3
            if (Stamina<=0 && Mana<=0)
                Stamina=0
            Mana=0
            Health-=(dmg*0.5).toInt()
            dmg
        }

    }



}