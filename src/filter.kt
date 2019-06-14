fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

    //Sorting curries by string length
    spices.filter { it.contains("curry") }.sortedBy { it.length }

    //contain curry
    val currySpices = spices.filter { it.contains("curry") }

    //Filtering by those that start with 'c' and end with 'e'
    val spices_Start_With_C_And_End_With_E1 = spices.filter { it.startsWith('c') && it.endsWith('e') }
    val valspices_Start_With_C_And_End_With_E12 = spices.filter { it.startsWith('c')}.filter { it.endsWith('e') }


//    Filtering the first 3 items by 'c'
    val spicesFirstThree = spices.take(3).filter { it.startsWith('c') }



    println(currySpices)
    print(spices_Start_With_C_And_End_With_E1)
    println(spicesFirstThree)
}