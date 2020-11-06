class Thief(name:String):Hero(name) {
    override var Health: Int=90
    override var Mana: Int=0
    override var Stamina: Int=150
    override var dmgmulti: Double=2.5

    override fun atack(Target: Hero):Int {
        return Target.takedmg((getdmg()*dmgmulti).toInt())
    }

    override fun takedmg(dmg: Int): Int {
        return if (Stamina <= 0) {
            Stamina + 2
            Health -= dmg
            dmg
        } else {
            Stamina - 10
            if (Stamina <= 0 && Mana <= 0)
                Stamina = 0
            Health -= (dmg * 2.5).toInt()
            dmg

        }
    }
}