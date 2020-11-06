fun main(){
    var name:String= readLine().toString()
    var answer : String = ""
    lateinit var character : Hero
    while (true){
        println("Выберите класс персонажа: \n 1. Маг \n 2. Вор \n 3.Воин")
        answer= readLine().toString()
        if (answer=="1"){
            character=Mag(name)
            break
        }
        else if (answer=="2"){
            character=Thief(name)
            break
        }
        else if (answer=="3"){
            character=Warrior(name)
            break
        }
        else{
            continue
        }
    }
    while (true){
        answer= readLine().toString()
        if (answer==""){
            var enemy:Hero= listOf(Mag("Вова"),Warrior("Гриша"),Thief("Павел")).random()
            println("Бой начался")
            while (true){
                println("Вы нанесли ${character.atack(enemy)},осталось ${enemy.Health}")
                if (enemy.dead()){
                    println("Противник умер")
                    character.chil()
                    readLine()
                    break
                }
                println("Вы получили ${enemy.atack(character)},остлось ${character.Health}")
                if (character.dead()){
                    println("Ты сдох")
                    character.chil()
                    readLine()
                    break
                }
                else{
                    readLine()
                }

            }

        }

    }

}