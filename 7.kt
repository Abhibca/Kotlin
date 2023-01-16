// Arrya3

fun main(args: Array<String>) {
    val name = arrayOf<String>("Ajay", "parag", "jay", "john", "sumit")
    var myArray2 = arrayOf<Int>(1, 10, 4, 6, 15)
    var myArray3 = arrayOf(5, 3, 4, 45, 5)
    var myArray4 = arrayOf(1, 1, 4, "abhi", "prakesh")
    var myArray5: IntArray = intArrayOf(5, 12, 23, 12, 22)

    for (element in name) {
        println(element)
    }

    println()
    for (element in myArray2) {
        println(element)
    }

    println()
    for (element in myArray3) {
        println(element)
    }

    println()
    for (element in myArray4) {
        println(element)
    }

    println()
    for (element in myArray5) {
        println(element)
    }
}
