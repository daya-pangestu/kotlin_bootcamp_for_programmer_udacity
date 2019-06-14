fun main() {
    whatSOuldIDoToday("sad")
}

fun whatSOuldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) :String{
    return when  {
        mood == "happy" && weather == "sunny" -> "go for a walk"
        else -> "stay home amd read"
    }
}