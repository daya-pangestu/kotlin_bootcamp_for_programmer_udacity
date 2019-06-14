fun main() {
    whatSOuldIDoToday("sad")
}

fun whatSOuldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) :String{
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood,weather) -> "go for a walk"
        else -> "stay home and read"
    }


}
fun isVeryHot(temperature: Int) = temperature > 35
fun isSadRainyCold(mood: String, wheather: String, temperature: Int) =
    mood == "sad" && "wheater" == "rainy" && temperature == 0
fun isHappySunny(mood:String,wheather: String) = mood == "happy" && wheather =="sunny"
