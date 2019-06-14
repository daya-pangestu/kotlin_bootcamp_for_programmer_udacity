fun main() {
    var fortune : String
    for (i in 1..10) {
        fortune = getFortuneCookie()
        println("\n your fortune cookie is $fortune")
        if ( fortune.contains("Take it easy")) break
    }
}

fun getFortuneCookie() :String {
    val listCookies = listOf(
        "You will have a great day!",
        "Things will go well for you today.", "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.", "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")

    val index = when (getBirthday()) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> getBirthday().rem(listCookies.size)
    }
    return listCookies[index]
}

fun getBirthday() :Int {

    print("\nEnter your birthday :")
    return readLine()?.toIntOrNull() ?:1
}

