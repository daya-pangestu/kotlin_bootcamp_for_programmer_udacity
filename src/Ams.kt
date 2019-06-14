import java.util.*

fun main(args: Array<String>) {
    feedtheFish()
}

fun feedtheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("today is $day and the fish eat $food")
    if (shouldChangeTheWater(day)) {
        println("change the water today")
    }
}

fun shouldChangeTheWater(
    day :String,temperature: Int = 22, dirty: Int = 20 ) : Boolean {

    return when {
        isToHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else-> false
    }
}

fun isToHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "sunday"




fun randomDay() : String{
    val week = listOf("monday","tuesday","wednesday","thuersday","friday","saturday","sunday")
    return week[Random().nextInt(7)]
}


fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "flakes"
        "Wednesday" -> "flakes"
        "Friday" -> "flakes"
        "Saturday" -> "flakes"
        "SUnday" -> "flakes"
        else -> "fasting"
    }
}


fun fitMoreFIsh(tankSize: Float, currentFish: List<Int>, fishSize: Int = 2, hasDecoration: Boolean = false): Boolean {
    return (tankSize * if (hasDecoration) 0.8 else 1.0 )>= (currentFish.sum()+ fishSize )
}


