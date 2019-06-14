import java.lang.Math.random
import java.util.*

fun main() {

    val rollDice = { Random().nextInt(12) + 1 }
    val rollDice2 = { sides : Int ->
        Random().nextInt(sides)+1
    }
    val rollDice0 = {sides:Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1 }

    val rollDice3: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    gamePlay(rollDice2(4))
}

fun gamePlay(diceRoll: Int){
    // do something with the dice roll
    println(diceRoll)
}